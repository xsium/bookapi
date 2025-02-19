package com.tyrfing.bookapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyrfing.bookapi.exception.BookAlreadyExistException;
import com.tyrfing.bookapi.exception.BookNotFound;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BookNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String booknotfound(BookNotFound e) {
        return e.getMessage();
    }

    @ExceptionHandler(BookAlreadyExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String bookExist(BookAlreadyExistException e) {
        return e.getMessage();
    }
}
