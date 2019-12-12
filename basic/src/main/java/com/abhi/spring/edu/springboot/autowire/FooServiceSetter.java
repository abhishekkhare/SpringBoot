package com.abhi.spring.edu.springboot.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class FooServiceSetter {
    private FooFormatter fooFormatter;

    @Autowired
    public void setFooFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }

    public FooFormatter getFooFormatter() {
        return this.fooFormatter ;
    }
}
