package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class ContactUsForm <T, U> {
    private final static Logger CONTACT_FORM_LOGGER = LogManager.getLogger(ContactUsForm.class);
    private T fullName;
    private U formNumber;

    public ContactUsForm() {

    }

    public ContactUsForm(T fullName, U formNumber) {
        this.fullName = fullName;
        this.formNumber = formNumber;
    }

    public T getFullName() {
        return fullName;
    }

    public void setFullName(T fullName) {
        this.fullName = fullName;
    }

    public U getFormNumber() {
        return formNumber;
    }

    public void setFormNumber(U formNumber) {
        this.formNumber = formNumber;
    }

    public void showFormInfo() {
        CONTACT_FORM_LOGGER.info("Form info: " + fullName + " " + formNumber);
    }

    @Override
    public String toString() {
        return "ContactUsForm{ " + "Full Name: " + fullName + ", Form Number ID: " + formNumber + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, formNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactUsForm contactUsForm = (ContactUsForm) o;
        return hashCode() == contactUsForm.hashCode();
    }
}
