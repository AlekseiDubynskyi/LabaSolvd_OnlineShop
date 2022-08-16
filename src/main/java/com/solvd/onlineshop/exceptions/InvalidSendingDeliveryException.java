package com.solvd.onlineshop.exceptions;

public class InvalidSendingDeliveryException extends Exception {
    public InvalidSendingDeliveryException() {
        super("Payment or transaction were not successful. Please try it again.");
    }

    public InvalidSendingDeliveryException(String message) {
        super(message);
    }
}
