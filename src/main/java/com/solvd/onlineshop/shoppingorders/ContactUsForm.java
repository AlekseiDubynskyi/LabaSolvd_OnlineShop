package com.solvd.onlineshop.shoppingorders;

import com.solvd.onlineshop.location.City;
import com.solvd.onlineshop.location.Country;
import com.solvd.onlineshop.mainshop.OnlineShop;
import com.solvd.onlineshop.people.Person;

import java.util.Objects;

public class ContactUsForm {
    private OnlineShop nameCompany;
    private Person firstname;
    private Person lastname;
    private ShoppingOrder orderID;

    public ContactUsForm() {

    }

    public ContactUsForm(OnlineShop nameCompany, Person firstname, Person lastname, ShoppingOrder orderID) {
        this.nameCompany = nameCompany;
        this.firstname = firstname;
        this.lastname = lastname;
        this.orderID = orderID;
    }

    public OnlineShop getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(OnlineShop nameCompany) {
        this.nameCompany = nameCompany;
    }

    public ShoppingOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(ShoppingOrder orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Contact Us Form{" + '\''
                + " Shopping order = " + getOrderID() + '\''
                + ", name =" + firstname + lastname +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany.hashCode(), firstname.hashCode(), lastname.hashCode(), orderID.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactUsForm contactUsForm = (ContactUsForm) o;
        return hashCode() == contactUsForm.hashCode();
    }
}
