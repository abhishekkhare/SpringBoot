package com.abhi.spring.edu.springboot.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    public FooFormatter fooFormatter;

}
