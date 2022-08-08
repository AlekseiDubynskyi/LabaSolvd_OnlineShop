package com.solvd.onlineshop.exceptions;

public class InvalidSendingDelivery extends Exception {
    public InvalidSendingDelivery() {
        super("Payment or transaction were not successful. Please try it again.");
    }

    public InvalidSendingDelivery(String message) {
        super(message);
    }
}
