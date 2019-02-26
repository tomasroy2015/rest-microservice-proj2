package jp.co.linkstaff.iis.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jp.co.linkstaff.iis.model.Doctor;
import jp.co.linkstaff.iis.repository.DoctorRepository;


@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorServiceTest {
	@Mock
	DoctorRepository repository;
	@InjectMocks
	DoctorService service;
	private static final String ID = "D1";
	
	
	@Test
	public void findByIdTest() {
//		service.getArea(ID);
//		verify(repository).findById(ID);
	}
	@Test
	public void getAllTest() {
		service.getAll("doctor", 0, 5);
		verify(repository).findAll();		
	}
	@Test
	public void saveTest() {
		Doctor doctor = mock(Doctor.class);
		service.addDoctor(doctor);
		verify(repository).save(doctor);
	}
	@Test
	public void deleteTest() {
		service.deleteDoctor(ID);
		verify(repository).deleteById(ID);
	}
}
