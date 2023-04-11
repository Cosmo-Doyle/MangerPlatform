package org.acme.controller;

import org.acme.domain.Tester;
import org.acme.service.TesterService;
import org.acme.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tester")
public class TesterController {
    @Resource
    private TesterService testerService;

    @Autowired
    public void setTesterService(TesterService testerService){
        this.testerService=testerService;
    }

    @PostMapping("/create")
    public Result<Tester> createController(@RequestBody Tester newTester){
        Tester tester= testerService.createService(newTester);
        if(tester!=null){
            return Result.success(tester,"测评师对象创建成功");
        }else {
            return Result.error("333","测评师已存在");
        }
    }

    @DeleteMapping("/delete")
        public Result<Tester> removeController(@RequestBody Tester oldTester) {
        int flag = testerService.deleteService(oldTester);
        if (flag == 1) {
            return Result.success(oldTester, "删除测评师成功");
        } else {
            return Result.error("000", "不存在测评师，删除失败");
        }
    }
}
