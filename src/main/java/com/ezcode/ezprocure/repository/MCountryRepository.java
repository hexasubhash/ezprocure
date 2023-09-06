package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MAssetDiv;
import com.ezcode.ezprocure.models.MCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MCountryRepository extends JpaRepository<MCountry, Long> {
}
