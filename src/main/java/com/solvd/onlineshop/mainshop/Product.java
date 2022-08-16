package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.processes.partnership.Seller;

import java.util.Objects;

public class Product {
    private String productID;
    private String productName;
    private String sellerName;
    private double price;

    public Product() {

    }

    public Product(String productID, String productName, String sellerName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.sellerName = sellerName;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }



    @Override
    public String toString() {
        return "Product: {Product ID: " + productID + ", product name: " + productName + ", seller: " + sellerName +
                ", price ($): " + price + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID.hashCode(), productName.hashCode(), sellerName.hashCode(), price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return hashCode() == product.hashCode();
    }
}
