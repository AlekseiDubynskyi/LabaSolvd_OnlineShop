package com.solvd.onlineshop.mainshop;

import java.util.ArrayList;
import java.util.Objects;

public class Category {
    private String categoryID;
    private String categoryName;
    ArrayList<Product> products = new ArrayList<Product>();

    public Category() {

    }

    public Category(String categoryID, String categoryName, ArrayList<Product> products) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category_name) {
        this.categoryName = categoryName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" + '\''
                + "CategoryID = " + categoryID + '\''
                + ", category name =" + categoryName +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID.hashCode(), categoryName.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return hashCode() == category.hashCode();
    }
}
