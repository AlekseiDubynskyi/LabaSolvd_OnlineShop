package com.solvd.onlineshop.exceptions;

public class InvalidSendingDelivery extends Exception {
    public InvalidSendingDelivery() {
        super("InvalidSendingDelivery");
    }

    public InvalidSendingDelivery(String message) {
        super(message);
    }
}
