package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.exceptions.InvalidPaymentException;
import com.solvd.onlineshop.interfaces.IPaymentSuccess;
import com.solvd.onlineshop.people.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Objects;

public class Payment implements IPaymentSuccess {
    final static Logger PaymentLogger = LogManager.getLogger(Payment.class);
    private int paymentID;
    private Customer customerID;
    private Date date;
    private boolean success;

    public Payment() {

    }

    public Payment(int paymentID, Customer customerID, Date date, boolean success) {
        this.paymentID = paymentID;
        this.customerID = customerID;
        this.date = date;
        this.success = success;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Payment {" + '\''
                + " payment ID = " + paymentID + '\''
                + ", customer ID =" + customerID + '\''
                + ", date =" + date + '\''
                + ", success =" + success +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentID, getCustomerID().hashCode(), date.hashCode(), success);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return hashCode() == payment.hashCode();
    }

    @Override
    public boolean paymentSuccess (Payment payment) {
        try {
            if (payment.success)
                PaymentLogger.info("Payment completed successfully. Thank you for buying our products!");
            else
                PaymentLogger.info("Payment was not successful. Please try it again.");
            throw new InvalidPaymentException("Something goes wrong");
        } catch (InvalidPaymentException e) {
            PaymentLogger.info("Payment ID: " + paymentID + ", customer ID: " + customerID +
                    ", success: " + success);
        }
        return false;
    }
}

