package com.solvd.onlineshop.people;

import com.solvd.onlineshop.interfaces.IBuy;
import com.solvd.onlineshop.interfaces.IOrder;

import java.util.Objects;
import java.util.logging.Logger;

public class Customer extends Person implements IBuy, IOrder {
    private final static Logger CustomerLogger = Logger.getLogger(String.valueOf(Customer.class));
    private String customerID;
    private String address;

    public Customer() {
    }

    public Customer(String customerID, String address) {
        this.customerID = customerID;
        this.address = address;
    }

    public Customer(String firstName, String lastName, String contact, String customerID, String address) {
        super(firstName, lastName, contact);
        this.customerID = customerID;
        this.address = address;
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

    @Override
    public String toString() {
        return "Customer" + getFirstName() + " " + getLastName() + '\''
                + ", contact = " + getContact() + '\''
                + ", customer ID = " + customerID + '\''
                + ", address = " + address +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName().hashCode(), getLastName().hashCode(), getContact().hashCode(),
                customerID.hashCode(), address.hashCode());
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
        CustomerLogger.info("I'm going to buy some products");
    }

    @Override
    public void makeOrder(Customer customer) {
        CustomerLogger.info("It's time to make an order!");
    }

    @Override
    public void cancelOrder(Customer customer) {
        CustomerLogger.info("I need to cancel my order.");
    }


}
