package jp.co.linkstaff.iis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jp.co.linkstaff.iis.exception.ResourceNotFoundException;
import jp.co.linkstaff.iis.model.Doctor;
import jp.co.linkstaff.iis.repository.DoctorRepository;

@Service
public class DoctorService {
	private static final Logger logger = LogManager.getLogger(DoctorService.class);

	@Autowired
	private DoctorRepository doctorRepo;

	public Page<Doctor> getAll(String profession, int page, int size) {
		return doctorRepo.findByProfessionalType(profession,PageRequest.of(page, size));
	}

	//active doctor list
	public Page<Doctor> getDoctorlist(boolean status,String profession, int page, int size) {
		return doctorRepo.findBydeactiveStatusAndProfessionalType(status, profession, PageRequest.of(page, size));
	}

	// get doctor information using DoctorId
	public Doctor getDoctor(String doctorId) {

		return doctorRepo.findByDoctorId(doctorId).orElseThrow(() -> new ResourceNotFoundException("Doctor", "doctorId", doctorId));
	}

	// insert new information of doctor
	public Doctor addDoctor(Doctor doctor) {

		try {
			doctorRepo.save(doctor);
			doctor.setDoctorId("D" + doctor.getId());
			doctor.setProfessionalType("doctor");
			return doctorRepo.save(doctor);

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return doctor;
	}

	// update information of doctor
	public Doctor updateDoctor(Doctor doctor, String doctorId) {
		//Optional<Doctor> doc= doctorRepo.findByDoctorId(doctorId);
		doctor.setDoctorId(doctorId);
		doctor.setId(Long.parseLong(doctorId.replace('D', '0')));
		return doctorRepo.save(doctor);
	}

	// update deactivate information of doctor
	public Doctor deactivateDoctor(String doctorId) {
		Doctor doctor= doctorRepo.findByDoctorId(doctorId).orElseThrow(()->new ResourceNotFoundException("Doctor", "doctorId", doctorId));
		doctor.setId(Long.parseLong(doctorId.replace('D', '0')));
		doctor.setDeactiveStatus(true); // true = deactivate
		return doctorRepo.save(doctor);
	}

	// update delete information of doctor from Admin
	public Doctor deleteDoctor(String doctorId) {
		Doctor doctor= doctorRepo.findByDoctorId(doctorId).orElseThrow(()->new ResourceNotFoundException("Doctor", "doctorId", doctorId));
		doctor.setId(Long.parseLong(doctorId.replace('D', '0')));
		doctor.setDeleteStatus(true); // true = delete
		return doctorRepo.save(doctor);
	}

}

