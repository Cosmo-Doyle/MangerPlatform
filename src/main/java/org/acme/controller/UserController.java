package org.acme.controller;

import org.acme.domain.User;
import org.acme.service.UserService;
import org.acme.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String uname, @RequestParam String password) {
        User user = userService.loginService(uname, password);
        if (user != null) {
            return Result.success(user, "登录成功！");
        } else {
            return Result.error("123", "账号或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result<User> registController(@RequestBody User newUser) {
        User user = userService.registService(newUser);
        if (user != null) {
            return Result.success(user, "注册成功！");
        } else {
            return Result.error("456", "用户名已存在！");
        }
    }

    @DeleteMapping("/delete")
    public Result<User> removeController(@RequestBody User oldUser) {
        int flag=userService.logOutService(oldUser);
        if(flag==1){
            return Result.success(oldUser, "注销用户成功");
        }else{
            return Result.error("000","不存在用户名，删除失败");
        }
    }
}