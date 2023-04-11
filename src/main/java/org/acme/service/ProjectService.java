package org.acme.service;

import org.acme.domain.Project;
import org.springframework.data.jpa.repository.Modifying;
import java.util.List;

public interface ProjectService {
    Project createService(Project project);

    List<Project> findByProjectNameService(String project_name);
    List<Project> findByLeader_nameService(String leader_name);
    List<Project> findByTest_unitService(String test_unit);
    List<Project> findByTest_timeService(String test_time);
    List<Project> findByProtect_levelService(String protect_level);
    List<Project> findBySign_contractService(String sign_contract);

    int deleteService(Project project);

    @Modifying
    Project updateService(long id, String projectName);
}
