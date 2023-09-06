package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MAssetDiv;
import com.ezcode.ezprocure.models.MCertificateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MCertificateTypeRepository extends JpaRepository<MCertificateType, Long> {
}
