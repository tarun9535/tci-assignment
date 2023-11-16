package com.tci.assignment.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorMessage {
    private String errorMessage;
    private Object data;

    public ErrorMessage(Object data, String errorMessage) {
        this.errorMessage = errorMessage;
        this.data = data;
    }
}
