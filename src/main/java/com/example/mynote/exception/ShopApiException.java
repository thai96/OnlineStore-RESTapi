package com.example.mynote.exception;

import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotNull;

public class ShopApiException extends RuntimeException{
    @NotNull
    public final HttpStatus status;
    public final String message;
    public ShopApiException(HttpStatus status, String message){
        super();
        this.status = status;
        this.message = message;
    }
    public ShopApiException(HttpStatus status, String message, Throwable exception){
        super(exception);
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
