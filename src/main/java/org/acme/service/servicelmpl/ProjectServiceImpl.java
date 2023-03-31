package org.acme.service.servicelmpl;

import org.acme.domain.Project;
import org.acme.repository.ProjectDao;
import org.acme.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        if(false) {
            //条件无法新增
            return null;
        }else {
            Project newProject = projectDao.save(project);
            return newProject;
        }
    }
}
