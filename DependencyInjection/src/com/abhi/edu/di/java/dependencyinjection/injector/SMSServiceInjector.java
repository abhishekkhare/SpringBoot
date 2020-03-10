package com.abhi.edu.di.java.dependencyinjection.injector;

import com.abhi.edu.di.java.dependencyinjection.consumer.Consumer;
import com.abhi.edu.di.java.dependencyinjection.consumer.MyDIApplication;
import com.abhi.edu.di.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
