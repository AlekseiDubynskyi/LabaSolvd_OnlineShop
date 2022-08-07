package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.exceptions.InvalidSendingDelivery;
import com.solvd.onlineshop.interfaces.ISendingOrder;
import com.solvd.onlineshop.mainshop.Product;
import com.solvd.onlineshop.people.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Objects;

public class Deliveries implements ISendingOrder {
    final static Logger DeliveriesLogger = LogManager.getLogger(Deliveries.class);
    private String deliveryID;
    private ShoppingOrder orderID;
    private Customer customerID;
    private Product productID;
    private Date date;

    public Deliveries() {}

    public Deliveries(String deliveryID, ShoppingOrder orderID, Customer customerID, Product productID, Date date) {
        this.deliveryID = deliveryID;
        this.orderID = orderID;
        this.customerID = customerID;
        this.productID = productID;
        this.date = date;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public ShoppingOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(ShoppingOrder orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Deliveries{" + '\''
                + " Delivery ID = " + deliveryID + '\''
                + ", shopping order =" + orderID + '\''
                + ", customer ID =" + customerID + '\''
                + ", product ID =" + productID + '\''
                + ", date =" + date +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryID.hashCode(), orderID.hashCode(), customerID.hashCode(),
                productID.hashCode(), date.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliveries deliveries = (Deliveries) o;
        return hashCode() == deliveries.hashCode();
    }

    @Override
    public void sendingOrder () {
        try {
            if (deliveryID != null)
                DeliveriesLogger.info("Sending an order: " + orderID + " for " + customerID.getFirstName() +
                        customerID.getLastName() + " on " + date);
            else
                DeliveriesLogger.info("Payment or transaction were not successful. Please try it again.");
            throw new InvalidSendingDelivery("Something goes wrong");
        } catch (InvalidSendingDelivery e) {
            DeliveriesLogger.info("Order ID: " + orderID + ", customer ID: " + customerID.getFirstName() +
                    customerID.getLastName() + ", date: " + date);
        }
    }
}
