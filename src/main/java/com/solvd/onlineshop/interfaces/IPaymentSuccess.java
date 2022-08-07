package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.shoppingorders.Payment;

public interface IPaymentSuccess {
    boolean paymentSuccess(Payment payment);
}
