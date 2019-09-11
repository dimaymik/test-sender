package com.example.testsender.dto;

public class HttpResponseDto {
    private String message;

    public HttpResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
