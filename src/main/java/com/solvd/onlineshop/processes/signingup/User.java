package com.solvd.onlineshop.processes.signingup;

import com.solvd.onlineshop.mainshop.Product;
import com.solvd.onlineshop.processes.buyingproducts.ProductsDatabase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String giftCode;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    @Override
    public String toString() {
        return "Dear " + firstName + " " + lastName + "!. Your account was successfully registered";
    }
}
