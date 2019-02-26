package jp.co.linkstaff.iis.repository;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import jp.co.linkstaff.iis.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
	Page<Hospital> findBydeactiveStatus(boolean b, Pageable pageable);
}

