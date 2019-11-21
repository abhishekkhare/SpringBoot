package com.abhi.spring.edu.springboot.api;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException() {

    }
}
