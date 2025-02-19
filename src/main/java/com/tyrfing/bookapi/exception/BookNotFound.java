package com.tyrfing.bookapi.exception;

public class BookNotFound extends RuntimeException {
    public BookNotFound(Long id) {
        super("The Book with ID: " + id + " does not exist.");
    }

}
