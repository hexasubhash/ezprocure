package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MLoc;
import com.ezcode.ezprocure.models.MSubloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MSubLocRepository extends JpaRepository<MSubloc, Long> {
}
