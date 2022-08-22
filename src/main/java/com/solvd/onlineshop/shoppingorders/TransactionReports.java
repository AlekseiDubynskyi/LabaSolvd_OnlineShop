package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.exceptions.InvalidTransactionException;
import com.solvd.onlineshop.interfaces.ITransactionSuccess;
import com.solvd.onlineshop.mainshop.Product;
import com.solvd.onlineshop.people.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Objects;

public class TransactionReports {
    private final static Logger REPORTS_LOGGER = LogManager.getLogger(TransactionReports.class);
    private String reportID;
    private Customer customerID;
    private ShoppingOrder orderID;
    private Product productID;
    private Payment paymentID;
    private Date date;
    private boolean success;

    public TransactionReports() {

    }

    public TransactionReports(String reportID, Customer customerID, ShoppingOrder orderID, Product productID,
                              Payment paymentID, Date date, boolean success) {
        this.reportID = reportID;
        this.customerID = customerID;
        this.orderID = orderID;
        this.productID = productID;
        this.paymentID = paymentID;
        this.date = date;
        this.success = success;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public ShoppingOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(ShoppingOrder orderID) {
        this.orderID = orderID;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
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
        return "Transaction report {" + '\''
                + " report ID = " + reportID + '\''
                + ", customer ID = " + customerID + '\''
                + ", shopping order = " + orderID + '\''
                + ", payment ID = " + paymentID + '\''
                + ", date = " + date + '\''
                + ", success = " + success +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportID.hashCode(), getCustomerID().hashCode(), getOrderID().hashCode(),
                getPaymentID().hashCode(), date.hashCode(), success);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionReports transactionReports = (TransactionReports) o;
        return hashCode() == transactionReports.hashCode();
    }

//    public boolean transactionSuccess(TransactionReports transactionReports) {
//        try {
//            if (transactionReports.success) {
//                REPORTS_LOGGER.info("Transaction completed successfully. Transaction ID is: " +
//                        getReportID());
//            } else {
//                REPORTS_LOGGER.info("Transaction was not successful. Please try again.");
//                return false;
//            }
//            throw new InvalidTransactionException("Something goes wrong");
//        } catch (InvalidTransactionException e) {
//            REPORTS_LOGGER.info("Report ID: " + reportID + ", customer ID: " + customerID + ", order ID" + orderID +
//                    ", success: " + success);
//        }
//        return false;
//    }

}