package com.solvd.onlineshop.location;

import java.util.Objects;

public class Country {
    private String name;

    public Country() {

    }

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode());
    }

    @Override
    public String toString() {
        return "{Country: " + getName() + "}";
    }
}
