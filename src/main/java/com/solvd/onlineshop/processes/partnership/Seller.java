package com.solvd.onlineshop.processes.partnership;

import com.solvd.onlineshop.companies.Company;
import com.solvd.onlineshop.interfaces.ISeller;

import java.util.*;

public class Seller extends Company implements ISeller {
    private String city;
    private String sellerID;
    private ArrayList<Seller> sellerList = new ArrayList<Seller>();
    private Set<Seller> sellers = new LinkedHashSet<>();

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

    public Set<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(Set<Seller> sellers) {
        this.sellers = sellers;
    }

    public ArrayList<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(ArrayList<Seller> sellerList) {
        this.sellerList = sellerList;
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
