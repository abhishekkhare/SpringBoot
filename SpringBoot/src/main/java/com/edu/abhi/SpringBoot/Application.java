package com.edu.abhi.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(
    "com.edu.abhi.SpringBoot.repository") // scan the specified package for repositories
@EntityScan("com.edu.abhi.SpringBoot.entity") // pick up our JPA entities
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
