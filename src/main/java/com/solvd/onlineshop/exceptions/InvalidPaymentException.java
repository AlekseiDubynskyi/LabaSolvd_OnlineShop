package com.solvd.onlineshop.exceptions;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException() {
        super("Payment was not successful. Please try it again.");
    }

    public InvalidPaymentException(String message) {
        super(message);
    }
}
