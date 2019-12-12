package com.abhi.spring.edu.springboot.autowire;

import com.abhi.spring.edu.springboot.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String [] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        FooService fooService = ctx.getBean(FooService.class);
        System.out.println(fooService.fooFormatter.format());

        FooServiceSetter fooServiceSetter = new FooServiceSetter();
        System.out.println(fooServiceSetter.getFooFormatter().format());
    }
}
