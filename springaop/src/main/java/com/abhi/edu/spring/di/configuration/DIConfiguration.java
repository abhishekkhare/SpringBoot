package com.abhi.edu.spring.di.configuration;

import com.abhi.edu.spring.di.services.EmailService;
import com.abhi.edu.spring.di.services.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value = {"com.abhi.edu.spring.di.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }
}
