package org.acme.repository;

import org.acme.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {
    Project findByProject_name(String project_name);
    Project findByProject_id(long project_id);

    void deleteByProject_id(long project_id);

    //根据项目名称查找项目信息
    List<Project> findProjectByProject_name(String project_name);
    //根据项目负责人查找项目信息
    List<Project> findProjectByLeader_name(String leader_name);
    //根据被测单位查找项目信息
    List<Project> findProjectByTest_unit(String test_unit);
    //根据测评时间查找项目信息
    List<Project> findProjectByTest_time(String test_time);
    //根据保护等级查找项目信息
    List<Project> findProjectByProtect_level(String protect_level);
    //根据合同时间查找项目信息
    List<Project> findProjectBySign_contract(String sign_contract);

}
