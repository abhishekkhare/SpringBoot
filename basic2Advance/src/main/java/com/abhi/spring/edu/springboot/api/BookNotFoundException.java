package com.abhi.spring.edu.springboot.api;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException() {

    }
}
