package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.location.City;
import com.solvd.onlineshop.companies.Company;

import java.util.Objects;

public class OnlineShop extends Company {
    private String licenseID;

    public OnlineShop() {
    }

    public OnlineShop(String licenseID) {
        this.licenseID = licenseID;
    }

    public OnlineShop(String name, String contact, City city, String licenseID) {
        super(name, contact, city);
        this.licenseID = licenseID;
    }

    public String getLicenseID(){
        return licenseID;
    }

    public void setLicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    @Override
    public String toString() {
        return "OnlineShop {" + getName() + '\''
                + ", contact = " + getContact() + '\''
                + ", city = " + getCity() + '\''
                + ", license ID = " + licenseID +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), getCity().hashCode(),
                getLicenseID().hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineShop onlineShop = (OnlineShop) o;
        return hashCode() == onlineShop.hashCode();
    }


}

