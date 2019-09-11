package com.example.testsender.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderCreator {
    public Sender createSender(Integer code) {
        switch (code) {
            case 1:
                return new SmsSenderService();
            case 2:
                return new WhatsUpSenderService();

            default:
                throw new IllegalArgumentException("Invalid code: "
                        + code);
        }
    }
}
