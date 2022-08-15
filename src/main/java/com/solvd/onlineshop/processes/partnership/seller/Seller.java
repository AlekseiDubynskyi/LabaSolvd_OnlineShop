package com.solvd.onlineshop.processes.partnership.seller;

import com.solvd.onlineshop.companies.Company;

import java.util.Objects;

public class Seller extends Company {
    private String city;
    private String sellerID;

    public Seller() {

    }

    public Seller(String city, String sellerID) {
        this.city = city;
        this.sellerID = sellerID;
    }

    public Seller(String name, String contact, String city, String sellerID) {
        super(name, contact);
        this.city = city;
        this.sellerID = sellerID;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    @Override
    public String toString() {
        return getName() + ". Your ID is: " + sellerID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), sellerID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return hashCode() == seller.hashCode();
    }
}
