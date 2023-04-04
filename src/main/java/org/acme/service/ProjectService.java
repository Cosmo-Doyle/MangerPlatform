package org.acme.service;

import org.acme.domain.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectService {
    Project createService(Project project);

    List<Project> findByProjectNameService(String project_name);
    List<Project> findByLeader_nameService(String project_name);
    List<Project> findByTest_unitService(String project_name);
    List<Project> findByTest_timeService(String project_name);
    List<Project> findByProtect_levelService(String project_name);
    List<Project> findBySign_contractService(String project_name);

    int deleteService(Project project);

    @Modifying
    Project updateService(long id, String projectName);
}
