package com.example.controller;

import com.example.model.Cat;
import com.example.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUser(@RequestBody Cat cat) {

        return "李四";
    }

    @PostMapping
    public String addUser(String username) {
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
