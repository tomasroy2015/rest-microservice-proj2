package jp.co.linkstaff.iis.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import jp.co.linkstaff.iis.model.Doctor;
import jp.co.linkstaff.iis.service.DoctorService;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {
	@LocalServerPort
    private int port;
	
	@Autowired
	private AdminController adminController;
	@Autowired
	DoctorService doctorService;
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
    public void contexLoads() throws Exception {
        assertThat(adminController).isNotNull();
    }
	/**
	 * check accurate name against id 
	 * @throws Exception
	 */
	@Test
	public void getName() throws Exception{		
		Doctor doctor =  new Doctor();
		doctor.setFirstname("Ashik");
		doctor.setLastname("Khan");
		doctorService.addDoctor(doctor);
        
		Long id = doctor.getId();
		
	   	ResponseEntity<Doctor> response = restTemplate.getForEntity("/admin/doctor/"+id, Doctor.class);
	   	assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	   	assertThat(response.getBody().getFirstname().equals("Ashik"));
	}
	/**
	 * 
	 * @throws Exception10
	 */
	@Test
	public void updateDoctor() throws Exception{			
		Doctor doctor =  new Doctor();
		doctor.setFirstname("one");
		doctor.setLastname("A01");
	   	restTemplate.put("/admin/doctor/1",doctor);
	}
}
