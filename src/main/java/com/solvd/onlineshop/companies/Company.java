package com.solvd.onlineshop.companies;

import com.solvd.onlineshop.location.City;

import java.util.Objects;

public abstract class Company {
    private String name;
    private String contact;
    private City city;

    public Company() {

    }

    public Company(String name, String contact, City city) {
        this.name = name;
        this.contact = contact;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company{" + name + '\''
                + ", contact=" + contact + '\''
                + ", city=" + city +
        '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(), getCity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return hashCode() == company.hashCode();
    }
}
