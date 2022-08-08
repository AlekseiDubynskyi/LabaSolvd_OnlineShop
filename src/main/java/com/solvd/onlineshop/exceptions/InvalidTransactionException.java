package com.solvd.onlineshop.exceptions;

public class InvalidTransactionException extends Exception {
    public InvalidTransactionException() {
        super("Transaction was not successful. Please try again.");
    }

    public InvalidTransactionException (String message) {
        super(message);
    }
}
