package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.ERole;
import com.ezcode.ezprocure.models.MAssetDiv;
import com.ezcode.ezprocure.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MAssetDivRepository extends JpaRepository<MAssetDiv, Long> {
}
