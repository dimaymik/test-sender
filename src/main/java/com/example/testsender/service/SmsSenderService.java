package com.example.testsender.service;

public class SmsSenderService implements Sender {

    @Override
    public String send(String message) {
        return "sms sent: " + message;
    }
}
