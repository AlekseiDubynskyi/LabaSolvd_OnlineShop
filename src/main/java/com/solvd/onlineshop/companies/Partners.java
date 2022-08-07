package com.solvd.onlineshop.companies;

import java.util.Objects;

import com.solvd.onlineshop.location.City;

public class Partners extends Company {
    private String partnerID;

    public Partners() {

    }
    public Partners(String partnerID) {
        this.partnerID = partnerID;
    }
    public Partners(String name, String contact, City city, String partnerID) {
        super(name, contact, city);
        this.partnerID = partnerID;
    }

    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String partnerID) {
        this.partnerID = partnerID;
    }

    @Override
    public String toString() {
        return "Company {" + getName() + '\''
                + ", contact = " + getContact() + '\''
                + ", city = " + getCity() + '\''
                + ", partner ID = " + partnerID +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), getCity().hashCode(),
                partnerID.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partners partners = (Partners) o;
        return hashCode() == partners.hashCode();
    }
}
