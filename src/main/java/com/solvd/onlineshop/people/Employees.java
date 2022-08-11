package com.solvd.onlineshop.people;

import com.solvd.onlineshop.companies.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employees extends Person {
    private Company company;
    private List<String> position = new ArrayList<String>();

    public Employees() {

    }

    public Employees(Company company, List<String> position) {
        this.company = company;
        this.position = position;
    }

    public Employees(String firstName, String lastName, String contact, Company company, List<String> position) {
        super(firstName, lastName, contact);
        this.company = company;
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<String> getPosition() {
        return position;
    }

    public void setPosition(List<String> position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "{Employee" + getFirstName() + " " + getLastName() + ", contact: " + getContact()
                + ", company: " + getCompany() + ", position: " + getPosition() + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName().hashCode(), getLastName().hashCode(),
                getContact().hashCode(), company.hashCode(), position.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return hashCode() == employees.hashCode();
    }
}
