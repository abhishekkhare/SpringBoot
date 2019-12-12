package com.abhi.spring.edu.springboot.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class FooServiceConstructor {
    private FooFormatter fooFormatter;

    @Autowired
    public FooServiceConstructor(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
}
