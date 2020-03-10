package com.abhi.edu.di.java.dependencyinjection.injector;

import com.abhi.edu.di.java.dependencyinjection.consumer.Consumer;
import com.abhi.edu.di.java.dependencyinjection.consumer.MyDIApplication;
import com.abhi.edu.di.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }

}
