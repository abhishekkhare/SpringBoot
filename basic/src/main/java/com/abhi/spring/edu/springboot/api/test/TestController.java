package com.abhi.spring.edu.springboot.api.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/")
    public String healthCheck() {
        return "Application Health Check Ok";
    }
}
