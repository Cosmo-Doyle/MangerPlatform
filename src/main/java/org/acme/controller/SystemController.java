package org.acme.controller;

import org.acme.domain.Project;
import org.acme.domain.System;
import org.acme.service.ProjectService;
import org.acme.service.SystemService;
import org.acme.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/system")
public class SystemController {
    @Resource
    private SystemService systemService;

    @Autowired
    public void setSystemService(SystemService systemService) {
        this.systemService = systemService;
    }

    @PostMapping("/create")
    public Result<System> createController(@RequestBody System newSystem) {
        System system = systemService.createService(newSystem);
        if (system != null) {
            return Result.success(system, "创建项目成功！");
        } else {
            return Result.error("456", "项目已存在！");
        }
    }

    @DeleteMapping("/delete")
    public Result<System> removeController(@RequestBody System oldSystem) {
        int flag = systemService.deleteService(oldSystem);
        if (flag == 1) {
            return Result.success(oldSystem, "删除项目成功");
        } else {
            return Result.error("000", "不存在项目，删除失败");
        }
    }

    @GetMapping("/query/system_name")
    public Result<List<System>> queryByProjectNameController(@RequestParam String searchContent) {
        List<System> system = systemService.findBySystemNameService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在系统，查询失败");
        }
    }

    @GetMapping("/query/test_unit")
    public Result<List<System>> queryByLeaderNameController(@RequestParam String searchContent) {
        List<System> system = systemService.findByTest_unitService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/belong_to_project")
    public Result<List<System>> queryByBelong_to_projectController(@RequestParam String searchContent) {
        List<System> system = systemService.findByTest_unitService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/filing_certificate_number")
    public Result<List<System>> queryByFiling_certificate_numberController(@RequestParam String searchContent) {
        List<System> system = systemService.findByFiling_certificate_numberService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }

    @GetMapping("/query/protect_level")
    public Result<List<System>> queryByProtect_levelController(@RequestParam String searchContent) {
        List<System> system = systemService.findByProtect_levelService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }
    @GetMapping("/query/test_status")
    public Result<List<System>> queryByTest_statusController(@RequestParam String searchContent) {
        List<System> system = systemService.findByTest_statusService(searchContent);
        if (system != null) {
            return Result.success(system, "查询成功");
        } else {
            return Result.error("222", "不存在工程，查询失败");
        }
    }
}
