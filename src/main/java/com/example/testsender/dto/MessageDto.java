package com.example.testsender.dto;

public class MessageDto {
    private String message;
    private String code;

    public MessageDto() {
    }
    public MessageDto(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
