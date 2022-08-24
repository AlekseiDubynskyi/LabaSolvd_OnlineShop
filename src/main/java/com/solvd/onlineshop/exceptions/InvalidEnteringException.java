package com.solvd.onlineshop.exceptions;

public class InvalidEnteringException extends RuntimeException {
    public InvalidEnteringException() {
        super("Wrong format of entered value.");
    }

    public InvalidEnteringException(String message) {
        super(message);
    }
}
