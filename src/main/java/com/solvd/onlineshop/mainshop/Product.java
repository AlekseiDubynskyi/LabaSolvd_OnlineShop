package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.processes.partnership.seller.Seller;

import java.util.Objects;
import java.util.Vector;

public class Product {
    private String productID;
    private Category categoryID;
    private String productName;
    private Seller name;
    private Vector<Category> categories = new Vector<Category>();

    public Product() {

    }

    public Product(String productID, Category categoryID, String productName, Seller name,
                   Vector<Category> categories) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.name = name;
        this.categories = categories;
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

    public Seller getName() {
        return name;
    }

    public void setName(Seller name) {
        this.name = name;
    }

    public Vector<Category> getCategories() {
        return categories;
    }

    public void setCategories(Vector<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "{Product: {Product ID: " + productID + ", product category: " + categoryID +
                ", product name: " + productName + ", seller: " + name + ", category name: " + categories + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID.hashCode(), categoryID.hashCode(), productName.hashCode(),
                name.hashCode(), getCategories().hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return hashCode() == product.hashCode();
    }
}
