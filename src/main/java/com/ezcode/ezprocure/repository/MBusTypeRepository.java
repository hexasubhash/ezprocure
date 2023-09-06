package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MBuilding;
import com.ezcode.ezprocure.models.MBussType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MBusTypeRepository extends JpaRepository<MBussType, Long> {

}
