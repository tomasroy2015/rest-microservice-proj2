package jp.co.linkstaff.iis.service;

import java.io.FileNotFoundException;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import jp.co.linkstaff.iis.exception.ResourceNotFoundException;
import jp.co.linkstaff.iis.model.Doctor;
import jp.co.linkstaff.iis.model.Hospital;
import jp.co.linkstaff.iis.repository.HospitalRepository;

@Service
public class HospitalService {

	private static final Logger logger = LogManager.getLogger(HospitalService.class);

	@Autowired
	private HospitalRepository hospitalRepo;

	public Page<Hospital> getAll(int page, int size) {
		return hospitalRepo.findAll(PageRequest.of(page, size));
	}
	
	//active hospital list
	public Page<Hospital> getHospitallist(boolean status, int page, int size) {
		return hospitalRepo.findBydeactiveStatus(status, PageRequest.of(page, size));
	}
	
	

	public Optional<Hospital> getHospital(Long id) {
		return hospitalRepo.findById(id);
	}

	public void addHospital(Hospital hospital) {

		try {
			hospitalRepo.save(hospital);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	public void updateHospital(Hospital hospital, long id) {
		try {
		hospital.setId(id);
		hospitalRepo.save(hospital);
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
	}

	// update delete information of hospital by Admin
	public Hospital deleteHospital(Long id) {
		Hospital hospital = hospitalRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hospital", "Id", id));
		hospital.setId(id);
		hospital.setDeleteStatus(true);// True = deleted
		return hospitalRepo.save(hospital);
	}

	// update deactivate information of Hospital
	public Hospital deactivateHospital( Long id) {
		Hospital hospital = hospitalRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Hospital", "Id", id));
		hospital.setId(id);
		hospital.setDeactiveStatus(true); // True = deactivated
		return hospitalRepo.save(hospital);

	}
}
