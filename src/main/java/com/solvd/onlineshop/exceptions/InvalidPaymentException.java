package com.solvd.onlineshop.exceptions;

import java.io.IOException;

public class InvalidPaymentException extends Exception {
    public InvalidPaymentException(IOException e) {
        super("Payment was not successful. Please try it again.");
    }

    public InvalidPaymentException(String message) {
        super(message);
    }
}
