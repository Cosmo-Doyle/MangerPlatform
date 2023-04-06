package org.acme.repository;

import org.acme.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {
    Project findByProject_name(String project_name);
    Project findByProject_id(long project_id);

    void deleteByProject_id(long project_id);

    List<Project> findProjectByProject_name(String leader_name);
    List<Project> findProjectByLeader_name(String leader_name);
    List<Project> findProjectByTest_unit(String test_unit);
    List<Project> findProjectByTest_time(String test_time);
    List<Project> findProjectByProtect_level(String protect_level);
    List<Project> findProjectBySign_contract(String sign_contract);

}
