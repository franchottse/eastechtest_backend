package com.example.eastechtest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class MissingParameterException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public MissingParameterException(String message) {
        super(message);
    }
}
