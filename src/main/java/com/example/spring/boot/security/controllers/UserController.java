package com.example.spring.boot.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @GetMapping("/list")
    public String index() {
        return "list user";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
