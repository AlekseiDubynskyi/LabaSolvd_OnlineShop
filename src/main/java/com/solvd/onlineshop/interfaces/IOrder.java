package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.people.Customer;

public interface IOrder {
    public void makeOrder(Customer customer);
    public void cancelOrder(Customer customer);
}
