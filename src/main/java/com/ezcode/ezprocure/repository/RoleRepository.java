package com.ezcode.ezprocure.repository;

import java.util.Optional;

import com.ezcode.ezprocure.models.ERole;
import com.ezcode.ezprocure.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
