package com.ezcode.ezprocure.repository;

import com.ezcode.ezprocure.models.MSubassetDiv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MSubAssetDivRepository extends JpaRepository<MSubassetDiv, Long> {

    @Query(value= "SELECT am FROM MSubassetDiv am where am.idSAssetdiv=?1")
    List<MSubassetDiv> findByMMAssetDivByIdAssetdiv(int id);
}
