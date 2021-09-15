package com.suleesulee.MAKDUCKuserservice.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user-service")
@Slf4j
public class UserController {
    Environment env;
    @Autowired
    public UserController(Environment env){
        this.env = env;
    }


    @GetMapping("/test")
    public String test(){
        return "test user-service";
    }
    @GetMapping("/check")
    public String check(HttpServletRequest req){
        log.info("Server port={}", req.getServerPort());
        return String.format("PORT:%s", env.getProperty("local.server.port"));
    }

}
