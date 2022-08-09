package com.solvd.onlineshop.people;

import com.solvd.onlineshop.companies.Company;

import java.util.Objects;

public class Employees extends Person {
    private Company company;
    private String position;

    public Employees() {

    }

    public Employees(Company company, String position) {
        this.company = company;
        this.position = position;
    }

    public Employees(String firstName, String lastName, String contact, Company company, String position) {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee" + getFirstName() + " " + getLastName() + '\''
                + ", contact = " + getContact() + '\''
                + ", company = " + getCompany() + '\''
                + ", position = " + getPosition() +
                '}';
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
