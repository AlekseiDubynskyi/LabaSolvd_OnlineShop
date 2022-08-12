package com.solvd.onlineshop.exceptions;

public class InvalidChoiceException extends Exception {
    public InvalidChoiceException() {
        super("Your choice is invalid. Please make your choice again.");
    }

    public InvalidChoiceException(String message) {
        super(message);
    }

}
