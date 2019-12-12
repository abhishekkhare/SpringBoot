package com.abhi.spring.edu.springboot.api.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @RequestMapping("/")
    public String healthCheck() {
        return "Application Health Check Ok";
    }
}
