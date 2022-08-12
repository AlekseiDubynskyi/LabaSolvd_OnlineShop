package com.solvd.onlineshop.processes.partnership.seller;

import com.solvd.onlineshop.interfaces.ISeller;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sellers implements ISeller {
    private Set<Seller> sellers = new LinkedHashSet<>();

    public Set<Seller> getSellers() {
        return sellers;
    }

    @Override
    public Seller addSeller(String name, String contact, String city, String sellerID) {
        Seller seller = new Seller();
        sellers.add(seller);
        return seller;
    }

    @Override
    public Seller addSeller(Seller seller) {
        sellers.add(seller);
        return seller;
    }

    @Override
    public Set<Seller> deleteSeller(Seller seller) {
        sellers.remove(seller);
        return sellers;
    }
}
