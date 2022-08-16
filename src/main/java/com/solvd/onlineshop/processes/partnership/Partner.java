package com.solvd.onlineshop.processes.partnership;

import com.solvd.onlineshop.companies.Company;
import com.solvd.onlineshop.interfaces.IPartner;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Partner extends Company implements IPartner {
    private String partnerID;
    private Set<Partner> partners = new LinkedHashSet<>();

    public Partner() {

    }
    public Partner(String partnerID) {
        this.partnerID = partnerID;
    }
    public Partner(String name, String contact, String partnerID) {
        super(name, contact);
        this.partnerID = partnerID;
    }

    public Set<Partner> getPartners() {
        return partners;
    }

    public void setPartners(Set<Partner> partners) {
        this.partners = partners;
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

    @Override
    public Partner addPartner(String name, String contact, String partnerID) {
        Partner partner = new Partner();
        partners.add(partner);
        return partner;
    }

    @Override
    public Partner addPartner(Partner partner) {
        partners.add(partner);
        return partner;
    }

    @Override
    public Set<Partner> deletePartner(Partner partner) {
        partners.remove(partner);
        return partners;
    }
}
