package org.acme.repository;

import org.acme.domain.System;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemDao extends JpaRepository<System,Long> {
    System findBySystem_name(String system_name);
    System findBySystem_id(long system_id);

    void deleteBySystem_id(long system_id);

    List<System> findSystemBySystem_name(String system_name);
    List<System> findSystemByBelong_to_project(String belong_to_project);
    List<System> findSystemByTest_unit(String test_unit);
    List<System> findSystemByFiling_certificate_number(String filing_certificate_number);
    List<System> findSystemByProtect_level(String protect_level);
    List<System> findSystemByTest_status(String test_status);


}
