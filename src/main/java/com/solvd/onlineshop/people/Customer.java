package com.solvd.onlineshop.people;

import com.solvd.onlineshop.interfaces.IBuy;
import com.solvd.onlineshop.interfaces.IOrder;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Person implements IBuy, IOrder {
    private final static Logger CUSTOMER_LOGGER = LogManager.getLogger(Customer.class);
    private String customerID;
    private String address;
    private String cardNumber;

    public Customer() {
    }

    public Customer(String customerID, String address, String cardNumber) {
        this.customerID = customerID;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public Customer(String firstName, String lastName, String contact, String customerID, String address, String cardNumber) {
        super(firstName, lastName, contact);
        this.customerID = customerID;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "{Customer: " + getFirstName() + " " + getLastName() + ", contact: " + getContact() +
                ", customer ID: " + customerID + ", address: " + address + ", card number: " + cardNumber + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName().hashCode(), getLastName().hashCode(), getContact().hashCode(),
                customerID.hashCode(), address.hashCode(), cardNumber.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return hashCode() == customer.hashCode();
    }

    @Override
    public void buy(Customer customer) {
        CUSTOMER_LOGGER.info("I'm going to buy some products");
    }

    @Override
    public void makeOrder(Customer customer) {
        CUSTOMER_LOGGER.info("It's time to make an order!");
    }

    @Override
    public void cancelOrder(Customer customer) {
        CUSTOMER_LOGGER.info("I need to cancel my order.");
    }


}
