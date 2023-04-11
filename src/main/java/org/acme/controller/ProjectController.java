package org.acme.controller;

import org.acme.domain.Project;
import org.acme.service.ProjectService;
import org.acme.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Resource
    private ProjectService projectService;

    @Autowired
    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    public Result<Project> createController(@RequestBody Project newProject) {
        Project project = projectService.createService(newProject);
        if (project != null) {
            return Result.success(project, "创建项目成功！");
        } else {
            return Result.error("456", "项目已存在！");
        }
    }

    @DeleteMapping("/delete")
    public Result<Project> removeController(@RequestBody Project oldProject) {
        int flag = projectService.deleteService(oldProject);
        if (flag == 1) {
            return Result.success(oldProject, "删除项目成功");
        } else {
            return Result.error("000", "不存在项目，删除失败");
        }
    }

    @GetMapping("/query/project_name")
    public Result<List<Project>> queryByProjectNameController(@RequestParam String searchContent) {
        List<Project> project = projectService.findByProjectNameService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/leader_name")
    public Result<List<Project>> queryByLeaderNameController(@RequestParam String searchContent) {
        List<Project> project = projectService.findByLeader_nameService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/test_unit")
    public Result<List<Project>> queryByTest_unitController(@RequestParam String searchContent) {
        List<Project> project = projectService.findByTest_unitService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/test_time")
    public Result<List<Project>> queryByTest_timeController(@RequestParam String searchContent) {
        List<Project> project = projectService.findByTest_timeService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/protect_level")
    public Result<List<Project>> queryByProtect_levelController(@RequestParam String searchContent) {
        List<Project> project = projectService.findByProtect_levelService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }
    @GetMapping("/query/sign_contract")
    public Result<List<Project>> queryBySign_contractController(@RequestParam String searchContent) {
        List<Project> project = projectService.findBySign_contractService(searchContent);
        if (project != null) {
            return Result.success(project, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }
    @PatchMapping("/update")
    public Result<Project> updateProjectPartially(@RequestParam Long id, @RequestParam String projectName) {
        Project project = projectService.updateService(id,projectName);
        return Result.success(project, "修改成功");
    }
}
