package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MVendorRepository extends JpaRepository<MVendor, Long> {
}
