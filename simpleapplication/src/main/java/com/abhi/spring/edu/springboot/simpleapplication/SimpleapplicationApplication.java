package com.abhi.spring.edu.springboot.simpleapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.abhi.spring.edu.springboot.simpleapplication.persistence.repo")
@EntityScan("com.abhi.spring.edu.springboot.simpleapplication.persistence.model")
@SpringBootApplication
public class SimpleapplicationApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleapplicationApplication.class, args);
    }
}
