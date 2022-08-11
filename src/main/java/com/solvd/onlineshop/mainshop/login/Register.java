package com.solvd.onlineshop.mainshop.login;

public class Register {
    private String firstName;
    private String lastName;
    private String password;
    private long phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Register credentials {First name: " + firstName + ", last name: " + lastName +
                ", password: " + password + ", phone number: " + phoneNumber + "}";
    }
}
