package com.solvd.onlineshop.companies;

import com.solvd.onlineshop.location.City;
import com.solvd.onlineshop.location.Country;
import java.util.Objects;

public class Departments extends Company {
    private String departmentID;
    private Country country;

    public Departments() {

    }

    public Departments(String departmentID, Country country) {
        this.departmentID = departmentID;
        this.country = country;
    }

    public Departments(String name, String contact, String departmentID, Country country) {
        super(name, contact);
        this.departmentID = departmentID;
        this.country = country;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Department {" + getName() + '\''
                + ", contact = " + getContact() + '\''
                + ", department ID = " + departmentID + '\''
                + ", country = " + country +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(),
                getDepartmentID().hashCode(), getCountry().hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments departments = (Departments) o;
        return hashCode() == departments.hashCode();
    }
}
