package jp.co.linkstaff.iis.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.linkstaff.iis.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
	Optional<Doctor> findByDoctorId(String doctorId);
	Page <Doctor> findBydeactiveStatusAndProfessionalType(Boolean deleteStatus,String ProfessionalType, Pageable pageable);
	Page<Doctor> findByProfessionalType(String professoinalType,Pageable pageable);
}
