package com.abhi.spring.edu.springboot.autowire;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component("fooFormatter")
public class FooFormatter {

    public String format() {
        return "foo -> " + new Date();
    }
}