package com.abhi.spring.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.abhi.spring.edu.springboot.dao")
@EntityScan("com.abhi.spring.edu.springboot.model")
@SpringBootApplication(scanBasePackages = "com.abhi.spring.edu.springboot")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
