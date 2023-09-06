package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MCountry;
import com.ezcode.ezprocure.models.MLoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MLocRepository extends JpaRepository<MLoc, Long> {
}
