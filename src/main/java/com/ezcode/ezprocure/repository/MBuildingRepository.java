package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MBuildingRepository extends JpaRepository<MBuilding, Long> {

    @Query(value= "SELECT am FROM MBuilding am where am.idBuilding=?1")
    List<MBuilding> findMBuildingByIdBuilding(String idBuilding);
}
