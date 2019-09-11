package com.example.testsender.service;

import org.springframework.stereotype.Service;

@Service("2")
public class WhatsUpSenderService implements Sender {

    @Override
    public String send(String message) {
        return "WhatsUp sent: " + message;
    }
}
