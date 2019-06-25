package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @PutMapping
    public String updateHello(String str) {
        return str;
    }
//restful 风格url
    @DeleteMapping
    public String deleteHello() {
        return "hello";
    }
}
