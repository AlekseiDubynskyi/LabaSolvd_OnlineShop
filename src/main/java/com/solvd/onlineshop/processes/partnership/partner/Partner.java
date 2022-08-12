package com.solvd.onlineshop.processes.partnership.partner;

import com.solvd.onlineshop.companies.Company;

import java.util.Objects;

public class Partner extends Company {
    private String partnerID;

    public Partner() {

    }
    public Partner(String partnerID) {
        this.partnerID = partnerID;
    }
    public Partner(String name, String contact, String partnerID) {
        super(name, contact);
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
        return getName() + ". Your ID is: " + partnerID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), partnerID.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partner partner = (Partner) o;
        return hashCode() == partner.hashCode();
    }
}
