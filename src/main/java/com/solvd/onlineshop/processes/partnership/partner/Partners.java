package com.solvd.onlineshop.processes.partnership.partner;

import com.solvd.onlineshop.interfaces.IPartner;

import java.util.LinkedHashSet;
import java.util.Set;

public class Partners implements IPartner {
    private Set<Partner> partners = new LinkedHashSet<>();

    public Set<Partner> getPartners() {
        return partners;
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
