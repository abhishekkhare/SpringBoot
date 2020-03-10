package com.abhi.edu.spring.di;

import com.abhi.edu.spring.di.configuration.DIConfiguration;
import com.abhi.edu.spring.di.consumer.MyApplication;
import com.abhi.edu.spring.di.consumer.MyXMLApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {
        annotationConfig();
        System.out.println("**********************************************");
        xmlConfig();
    }

    private static void xmlConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "spring.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);

        app.processMessage("Hi Abhishek", "Abhishek@abc.com");

        // close the context
        context.close();
    }

    private static void annotationConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);

        app.processMessage("Hi Abhishek", "Abhishek@abc.com");

        //close the context
        context.close();
    }

}
