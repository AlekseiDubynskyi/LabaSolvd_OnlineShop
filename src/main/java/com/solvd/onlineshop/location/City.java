package com.solvd.onlineshop.location;

import java.util.Objects;

public class City {
    private String name;
    private String postalCode;

    public City() {

    }

    public City(String name, String postalCode) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" + name + '\''
                + ", postal code=" + postalCode +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return hashCode() == city.hashCode();
    }
}
