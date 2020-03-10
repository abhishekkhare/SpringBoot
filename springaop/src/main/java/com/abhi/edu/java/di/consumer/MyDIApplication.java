package com.abhi.edu.java.di.consumer;


import com.abhi.edu.java.di.service.EmailServiceImpl;
import com.abhi.edu.java.di.service.MessageService;

public class MyDIApplication implements Consumer{

    private MessageService service;

    public MyDIApplication(){}

    //setter dependency injection
    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}