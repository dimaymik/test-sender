package com.example.testsender.service;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderCreator {
    @Autowired
    SmsSenderService smsSender;

    @Autowired
    WhatsUpSenderService whatsUpSender;

    @Autowired
    ApplicationContext ctx;

    public Sender createSender(String code) {
        try {
            return (Sender) ctx.getBean(code);
        } catch (NoSuchBeanDefinitionException e) {
            throw new IllegalArgumentException("Invalid sender code: " + code);
        }


    }
}
