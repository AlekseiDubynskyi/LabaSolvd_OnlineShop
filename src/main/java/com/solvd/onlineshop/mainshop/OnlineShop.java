package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.enums.StarReview;
import com.solvd.onlineshop.enums.WorkingDay;
import com.solvd.onlineshop.companies.Company;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class OnlineShop extends Company {
    private final static Logger ONLINESHOP_LOGGER = LogManager.getLogger(OnlineShop.class);
    private String licenseID;
    private WorkingDay workingDay;
    private StarReview starReview;

    public OnlineShop() {
    }

    public OnlineShop(String licenseID, WorkingDay workingDay, StarReview starReview) {
        this.licenseID = licenseID;
        this.workingDay = workingDay;
        this.starReview = starReview;
    }

    public OnlineShop(String name, String contact, String licenseID, WorkingDay workingDay, StarReview starReview) {
        super(name, contact);
        this.licenseID = licenseID;
        this.workingDay = workingDay;
        this.starReview = starReview;
    }

    public String getLicenseID(){
        return licenseID;
    }

    public void setLicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public WorkingDay getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(WorkingDay workingDay) {
        this.workingDay = workingDay;
    }

    public StarReview getStarReview() {
        return starReview;
    }

    public void setStarReview(StarReview starReview) {
        this.starReview = starReview;
    }

    @Override
    public String toString() {
        return "OnlineShop {" + getName() + '\''
                + ", contact = " + getContact() + '\''
                + ", license ID = " + licenseID +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName().hashCode(), getContact().hashCode(),
                getLicenseID().hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineShop onlineShop = (OnlineShop) o;
        return hashCode() == onlineShop.hashCode();
    }

    public void workingHours() {
        switch (workingDay) {
            case MONDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 5:00 p.m.");
                break;
            case TUESDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 5:00 p.m.");
                break;
            case WEDNESDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 5:00 p.m.");
                break;
            case THURSDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 5:00 p.m.");
                break;
            case FRIDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 5:00 p.m.");
                break;
            case SATURDAY:
                ONLINESHOP_LOGGER.info("Working hours are from 9:00 a.m. to 1:00 p.m.");
                break;
            case SUNDAY:
                ONLINESHOP_LOGGER.info("Day off.");
                break;
        }
    }

    public void reviewingShop() {
        switch (starReview){
            case ONE_STAR:
                ONLINESHOP_LOGGER.info("Submit one star.");
                break;
            case TWO_STARS:
                ONLINESHOP_LOGGER.info("Submit two stars.");
                break;
            case THREE_STARS:
                ONLINESHOP_LOGGER.info("Submit three stars.");
                break;
            case FOUR_STARS:
                ONLINESHOP_LOGGER.info("Submit four stars.");
                break;
            case FIVE_STARS:
                ONLINESHOP_LOGGER.info("Submit five stars.");
                break;
        }
    }
}

