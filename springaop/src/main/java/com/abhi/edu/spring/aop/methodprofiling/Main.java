package com.abhi.edu.spring.aop.methodprofiling;

import com.abhi.edu.spring.aop.methodprofiling.service.FooService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create Spring application context that configured by xml.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        // Get our service from the spring context (that we want to be profiled).
        FooService fooService = ctx.getBean(FooService.class);

        // Test profiling through methods calls.

        for (int i = 0; i < 10; i++) {
            fooService.doShortJob();
        }
        fooService.doLongJob();

        // Test that profiler also can handle Exceptions in profiled method.
        fooService.doSomethingThatThrowsException();

        // Close the spring context
        ctx.close();
    }
}
