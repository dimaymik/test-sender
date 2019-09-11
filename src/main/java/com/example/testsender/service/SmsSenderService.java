package com.example.testsender.service;

import org.springframework.stereotype.Service;

@Service("1")
public class SmsSenderService implements Sender {

    @Override
    public String send(String message) {
        return "sms sent: " + message;
    }
}
