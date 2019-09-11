package com.example.testsender.dto;

public class MessageDto {
    private String message;
    private Integer code;

    public MessageDto() {
    }
    public MessageDto(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
