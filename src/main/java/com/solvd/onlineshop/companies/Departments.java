package com.solvd.onlineshop.companies;

import com.solvd.onlineshop.Main;
import com.solvd.onlineshop.location.Country;
import com.solvd.onlineshop.mainshop.OnlineShop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Departments extends Company {
    private final static Logger DEPARTMENT_LOGGER = LogManager.getLogger(Departments.class);
    private String departmentID;
    private Country country;
    private MainDepartments mainDepartments;

    public Departments() {

    }

    public Departments(String departmentID, Country country, MainDepartments mainDepartments) {
        this.departmentID = departmentID;
        this.country = country;
        this.mainDepartments = mainDepartments;
    }

    public Departments(String name, String contact, String departmentID, Country country,
                       MainDepartments mainDepartments) {
        super(name, contact);
        this.departmentID = departmentID;
        this.country = country;
        this.mainDepartments = mainDepartments;
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

    public MainDepartments getMainDepartments() {
        return mainDepartments;
    }

    public void setMainDepartments(MainDepartments mainDepartments) {
        this.mainDepartments = mainDepartments;
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

    public void employeesQuantity() {
        switch (mainDepartments) {
            case NEWYORK:
                DEPARTMENT_LOGGER.info("The quantity of employees is 35.");
                break;
            case WASHINGTON:
                DEPARTMENT_LOGGER.info("The quantity of employees is 41.");
                break;
            case ONTARIO:
                DEPARTMENT_LOGGER.info("The quantity of employees is 11.");
                break;
            case LONDON:
                DEPARTMENT_LOGGER.info("The quantity of employees is 14.");
                break;
            case KYIV:
                DEPARTMENT_LOGGER.info("The quantity of employees is 54.");
                break;
            case WARSHAVA:
                DEPARTMENT_LOGGER.info("The quantity of employees is 38.");
                break;
            case PARIS:
                DEPARTMENT_LOGGER.info("The quantity of employees is 22.");
                break;
        }
    }
}
