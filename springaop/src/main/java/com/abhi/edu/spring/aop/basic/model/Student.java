package com.abhi.edu.spring.aop.basic.model;

import com.abhi.edu.spring.aop.basic.aspect.Loggable;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String nm) {
        this.name = nm;
    }

    public void throwException() {
        throw new RuntimeException("Dummy Exception");
    }
}
