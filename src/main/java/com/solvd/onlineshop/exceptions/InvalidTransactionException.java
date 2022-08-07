package com.solvd.onlineshop.exceptions;

public class InvalidTransactionException extends Exception {
    public InvalidTransactionException() {
        super("InvalidTransactionException");
    }
    public InvalidTransactionException (String message) {
        super(message);
    }
}
