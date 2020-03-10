package com.abhi.edu.java.di.injector;


import com.abhi.edu.java.di.consumer.Consumer;
import com.abhi.edu.java.di.consumer.MyDIApplication;
import com.abhi.edu.java.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }

}
