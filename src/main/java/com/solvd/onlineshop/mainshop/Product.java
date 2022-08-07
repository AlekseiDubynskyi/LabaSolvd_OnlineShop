package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.companies.Sellers;

import java.util.Objects;

public class Product {
    private String productID;
    private Category categoryID;
    private String productName;
    private Sellers name;

    public Product() {

    }

    public Product(String productID, Category categoryID, String productName, Sellers name) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.name = name;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Category getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Category categoryID) {
        this.categoryID = categoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Sellers getName() {
        return name;
    }

    public void setName(Sellers name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product {" + '\''
                + " product ID = " + productID + '\''
                + ", product category = " + categoryID + '\''
                + ", product name = " + productName + '\''
                + ", seller = " + name +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID.hashCode(), categoryID.hashCode(), productName.hashCode(), name.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return hashCode() == product.hashCode();
    }
}
