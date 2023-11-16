package com.tci.assignment.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> response(Object response, String message, boolean isSuccess, HttpStatus httpStatus) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", response);
        map.put("message", message);
        map.put("isSuccess", isSuccess);
        map.put("statusCode", httpStatus.value());
        map.put("timeStamp", new Date().getTime());
        return new ResponseEntity<>(map, httpStatus);
    }
}
