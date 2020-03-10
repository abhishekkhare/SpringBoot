package com.abhi.spring.edu.springboot;

import com.abhi.spring.edu.springboot.dao.BookRepository;
import markdownassets.dataaccess.MarkdownAssetsDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private BookRepository repository;

    @Autowired
    private MarkdownAssetsDao markdownAssetsDao;


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {

        log.info("StartApplication...");

        System.out.println("DONE!!!!!!!!!");



    }

}