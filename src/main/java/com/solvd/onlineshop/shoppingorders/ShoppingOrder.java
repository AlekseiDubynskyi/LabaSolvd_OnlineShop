package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.people.Customer;

import java.util.Date;
import java.util.Objects;

public class ShoppingOrder {
    private String orderID;
    private String customerID;
    private double totalPrice;
    private Date date;

    public ShoppingOrder() {

    }

    public ShoppingOrder(String orderID, String customerID, double totalPrice, Date date) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order {" + '\''
                + " order ID = " + orderID + '\''
                + ", customer ID = " + customerID + '\''
                + ", total price = " + totalPrice + '\''
                + ", date = " + date +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID.hashCode(), customerID.hashCode(), totalPrice, date.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingOrder shoppingOrder = (ShoppingOrder) o;
        return hashCode() == shoppingOrder.hashCode();
    }
}
