/**
*Author saidur, Ashik
*Date Oct 30, 2018
**/

package jp.co.linkstaff.iis.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import jp.co.linkstaff.iis.model.Doctor;
import jp.co.linkstaff.iis.model.Hospital;
import jp.co.linkstaff.iis.service.DoctorService;
import jp.co.linkstaff.iis.service.HospitalService;

@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired
HospitalService hospitalService;
@Autowired
DoctorService doctorService;

	// For Hospital
	@GetMapping("/hospital/all")
	public Page<Hospital> getHospitalList(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return hospitalService.getAll(page, size);
	}

	// For Hospital
	@GetMapping("/hospital/deactive")
	public Page<Hospital> getDeactiveHospitalList(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return hospitalService.getHospitallist(false, page, size);
	}

	@GetMapping("/hospital/{id}")
	public Optional<Hospital> getHospital(@PathVariable Long id) {
		
		return hospitalService.getHospital(id);
	}

	@PostMapping("/hospital/add")
	public ResponseEntity<Hospital> postHospital(@RequestBody Hospital hospital) {
		try {
		 hospitalService.addHospital(hospital);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@PutMapping("/hospital/update/{id}")
	public ResponseEntity<Hospital> updateHospital(@RequestBody Hospital hospital, @PathVariable Long id) {
		try {
			hospitalService.updateHospital(hospital, id);
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	@DeleteMapping("/hospital/delete/{id}")
	public ResponseEntity<Hospital> deleteHospital(@PathVariable Long id) {
		try {
			hospitalService.deleteHospital(id);
			 return new ResponseEntity<Hospital>(HttpStatus.NO_CONTENT);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	@DeleteMapping("/hospital/deactivate/{id}")
	public ResponseEntity<Hospital> deactivateHospital(@PathVariable Long id) {
		try {
			hospitalService.deactivateHospital(id);
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// Hospital

	// for admin
	@GetMapping("/doctor/all")
	public Page<Doctor> getDoctorlistall(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return doctorService.getAll("doctor", page, size);
	}

	// For view active doctore from hospital/admin page
	@GetMapping("/doctor/deactive")
	public Page<Doctor> getDoctorlist(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		
		return doctorService.getDoctorlist(false,"Doctor", page, size);
	}

	// Doctor can view his own information page after click the basic button
	@GetMapping("/doctor/{doctorId}")
	public Doctor getdoctorbasic(@PathVariable(value = "doctorId") String doctorId) {
		return doctorService.getDoctor(doctorId);

	}

	// doctor insert own information
	@PostMapping("/doctor/add")
	public ResponseEntity<Doctor> adddoctor(@RequestBody Doctor doctor) {
		try {
			 doctorService.addDoctor(doctor);
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// doctor can update his own basic information
	@PutMapping("/doctor/update/{doctorId}")
	public ResponseEntity<Doctor> updatedoctorinfo(@RequestBody Doctor doctor, @PathVariable String doctorId) {
		try {
			doctorService.updateDoctor(doctor, doctorId);
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

	}

	// doctor can update his own basic information
	@DeleteMapping("/doctor/deactivate/{doctorId}")
	public ResponseEntity<Doctor> updatedeactivatedoctorinfo(@PathVariable String doctorId) {
		try {
			doctorService.deactivateDoctor(doctorId);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// doctor can update his own basic information
	@DeleteMapping("/doctor/delete/{doctorId}")
	public ResponseEntity<Doctor> updatedeletedoctorinfo(@PathVariable String doctorId) {
		try {
			doctorService.deleteDoctor(doctorId);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// for admin
	@GetMapping("/student/all")
	public Page<Doctor> getAllStudents(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return doctorService.getAll("student", page, size);
	}

	// For view active doctore from hospital/admin page
	@GetMapping("/student/deactive")
	public Page<Doctor> getStudentlist(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "5") int size) {
		return doctorService.getDoctorlist(false,"Doctor", page, size);
	}

	// Doctor can view his own information page after click the basic button
	@GetMapping("/student/{doctorId}")
	public Doctor getStudent(@PathVariable(value = "doctorId") String doctorId) {
		return doctorService.getDoctor(doctorId);
	}

	// doctor insert own information
	@PostMapping("/student/add")
	public ResponseEntity<Doctor> addStudent(@RequestBody Doctor doctor) {
		try {
			 doctorService.addDoctor(doctor);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// doctor can update his own basic information
	@PutMapping("/student/update/{doctorId}")
	public ResponseEntity<Doctor> updateStudent(@RequestBody Doctor doctor, @PathVariable String doctorId) {
		try {
			doctorService.updateDoctor(doctor, doctorId);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}

	}

	// doctor can update his own basic information
	@DeleteMapping("/student/deactivate/{doctorId}")
	public ResponseEntity<Doctor> deactivateStudent(@PathVariable String doctorId) {
		try {
			doctorService.deactivateDoctor(doctorId);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

	// doctor can update his own basic information
	@DeleteMapping("/student/delete/{doctorId}")
	public ResponseEntity<Doctor> deleteStudent(@PathVariable String doctorId) {
		try {
			doctorService.deleteDoctor(doctorId);
			 return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

}
