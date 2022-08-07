package com.solvd.onlineshop.location;

import com.solvd.onlineshop.companies.Partners;
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
    public String toString() {
        return "Country {" + name + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return hashCode() == country.hashCode();
    }
}
