package com.example.testsender.service;

public class WhatsUpSenderService implements Sender {

    @Override
    public String send(String message) {
        return "WhatsUp sent";
    }
}
