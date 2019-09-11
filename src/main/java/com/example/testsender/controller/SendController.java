package com.example.testsender.controller;


import com.example.testsender.dto.HttpResponseDto;
import com.example.testsender.dto.MessageDto;
import com.example.testsender.service.SenderCreator;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
    @Autowired
    SenderCreator creator;
    @PostMapping("/send")
    HttpResponseDto sendMessage(@RequestBody MessageDto messageDto) {
        String code = messageDto.getCode();
        return new HttpResponseDto(creator.createSender(code).send(messageDto.getMessage()));
    }
}

