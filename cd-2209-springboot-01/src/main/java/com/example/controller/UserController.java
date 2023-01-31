package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    @RequestMapping("/test")
    public Object test(){
        log.info("username : {}", username);
        log.info("password : {}", password);
        return "测试成功";
    }
}
