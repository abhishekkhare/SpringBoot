package com.abhi.edu.java.di.injector;


import com.abhi.edu.java.di.consumer.Consumer;
import com.abhi.edu.java.di.consumer.MyDIApplication;
import com.abhi.edu.java.di.service.EmailServiceImpl;
import com.abhi.edu.java.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {

        MyDIApplication app = new MyDIApplication();
        app.setService(new SMSServiceImpl());
        return app;
    }

}
