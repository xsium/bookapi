package com.tyrfing.bookapi.exception;

import com.tyrfing.bookapi.model.Livre;

public class BookAlreadyExistException extends RuntimeException {
    public BookAlreadyExistException(Livre livre) {
        super("le livre: " + livre.getTitle() + " existe déjà.");
    }
}
