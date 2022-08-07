package com.solvd.onlineshop.companies;

import com.solvd.onlineshop.location.City;

import java.util.Objects;

public class Sellers extends Company {
    private String sellerID;

    public Sellers() {

    }

    public Sellers(String sellerID) {
        this.sellerID = sellerID;
    }

    public Sellers(String name, String contact, City city, String sellerID) {
        super(name, contact, city);
        this.sellerID = sellerID;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    @Override
    public String toString() {
        return "Sellers{" + getName() + '\''
                + ", company contact = " + getContact() + '\''
                + ", city = " + getCity() + '\''
                + ", sellerID = " + sellerID +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), getCity().hashCode(), sellerID.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sellers sellers = (Sellers) o;
        return hashCode() == sellers.hashCode();
    }
}
