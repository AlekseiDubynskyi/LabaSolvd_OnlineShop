package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.processes.partnership.seller.Seller;

import java.util.Set;

public interface ISeller {
    Seller addSeller(String name, String contact, String city, String sellerID);

    Seller addSeller(Seller seller);

    Set<Seller> deleteSeller(Seller seller);

}
