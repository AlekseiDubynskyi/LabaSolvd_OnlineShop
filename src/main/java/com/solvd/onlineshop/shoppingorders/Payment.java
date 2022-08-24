package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.exceptions.InvalidPaymentException;
import com.solvd.onlineshop.interfaces.IPaymentSuccess;
import com.solvd.onlineshop.people.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Objects;

public class Payment implements IPaymentSuccess {
    private final static Logger PAYMENT_LOGGER = LogManager.getLogger(Payment.class);
    private String paymentID;
    private String customerID;
    private Date date;
    private boolean success;

    public Payment() {

    }

    public Payment(String paymentID, String customerID, Date date, boolean success) {
        this.paymentID = paymentID;
        this.customerID = customerID;
        this.date = date;
        this.success = success;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
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
        return Objects.hash(getPaymentID().hashCode(), getCustomerID().hashCode(), date.hashCode(), success);
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
                PAYMENT_LOGGER.info("Payment completed successfully. Thank you for buying our products!");
            else
                PAYMENT_LOGGER.info("Payment was not successful. Please try it again.");
            throw new InvalidPaymentException("Something goes wrong");
        } catch (InvalidPaymentException e) {
            PAYMENT_LOGGER.info("Payment ID: " + paymentID + ", customer ID: " + customerID +
                    ", success: " + success);
        }
        return false;
    }
}

