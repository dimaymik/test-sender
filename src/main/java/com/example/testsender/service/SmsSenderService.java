package com.example.testsender.service;

import org.springframework.stereotype.Service;

@Service("001")
public class SmsSenderService implements Sender {

    @Override
    public String send(String message) {
        return "sms sent: " + message;
    }
}
