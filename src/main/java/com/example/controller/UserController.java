package com.example.controller;

import com.example.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户相关的请求")
@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation("获取用户信息")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "username", value = "用户名", dataType = "String", paramType = "header", defaultValue = "zhangsan", example = "lisi"),
                    @ApiImplicitParam(name = "password", value = "用户名", dataType = "int", paramType = "header", defaultValue = "zhangsan", example = "lisi")
            }
    )
    @GetMapping
    public String getUser(String username, String password) {
        return "李四";
    }
@ApiOperation("添加用户")
    @PostMapping
    public String addUser(@RequestHeader("token") String token, String username) {
        return username;
    }

    @DeleteMapping
    public User delUser() {
        User zs = new User("张三", 15);
        return zs;
    }

    @PutMapping
    public String putUser(@RequestBody User user) {

        return "user";
    }
}
