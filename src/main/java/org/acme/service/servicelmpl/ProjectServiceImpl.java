package org.acme.service.servicelmpl;

import org.acme.domain.Project;
import org.acme.repository.ProjectDao;
import org.acme.service.ProjectService;
import org.acme.utils.Back;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectDao projectDao;

    @Autowired
    public ProjectServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public Project createService(Project project) {
        if (projectDao.findByProject_name(project.getProject_name()) != null) {
            //条件无法新增
            return null;
        } else {
            Project newProject = projectDao.save(project);
            return newProject;
        }
    }

    @Override
    public int deleteService(Project project) {
        if(projectDao.findByProject_id(project.getProject_id())!=null){
            projectDao.deleteByProject_id(project.getProject_id());
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public Project updateService(long id,String project_name) {
        if(projectDao.findByProject_id(id)==null){
            return null;
        }else{
            Project updateProject=projectDao.findByProject_id(id);
            updateProject.setProject_name(project_name);
            projectDao.save(updateProject);
            return  updateProject;
        }
    }

    @Override
    public List<Project> findByProjectNameService(String project_name) {
        List<Project> list = projectDao.findProjectByProject_name(project_name);
        Back back = new Back();
        return back.projectSection(list);
    }

    @Override
    public List<Project> findByLeader_nameService(String leader_name) {
        List<Project> list = projectDao.findProjectByLeader_name(leader_name);
        Back back = new Back();
        return back.projectSection(list);
    }

    @Override
    public List<Project> findByTest_unitService(String project_name) {
        return null;
    }

    @Override
    public List<Project> findByTest_timeService(String project_name) {
        return null;
    }

    @Override
    public List<Project> findByProtect_levelService(String project_name) {
        return null;
    }

    @Override
    public List<Project> findBySign_contractService(String project_name) {
        return null;
    }
}
