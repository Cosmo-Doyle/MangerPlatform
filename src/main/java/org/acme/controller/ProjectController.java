package org.acme.controller;

import org.acme.domain.Project;
import org.acme.service.ProjectService;
import org.acme.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/project")
public class ProjectController{
    @Resource
    private ProjectService projectService;
    @Autowired
//    @Qualifier(value="projectService")
    public void setProjectService(ProjectService projectService){
        this.projectService=projectService;
    }
    @PostMapping("/create")
    public Result<Project> createController(@RequestBody Project newProject){
        Project project = projectService.createService(newProject);
        if(project!=null){
            return Result.success(project,"创建项目成功！");
        }else{
            return Result.error("456","项目已存在！");
        }
    }
}
