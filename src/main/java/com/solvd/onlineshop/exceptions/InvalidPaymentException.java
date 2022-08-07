package com.solvd.onlineshop.exceptions;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException() {
        super("InvalidPaymentException");
    }

    public InvalidPaymentException(String message) {
        super(message);
    }
}
