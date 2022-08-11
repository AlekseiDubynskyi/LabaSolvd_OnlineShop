package com.solvd.onlineshop;

import com.solvd.onlineshop.companies.Departments;
import com.solvd.onlineshop.companies.Partners;
import com.solvd.onlineshop.shoppingorders.ContactUsForm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        // final Logger MAIN_LOGGER = LogManager.getLogger(Main.class);

        ContactUsForm<Integer, String> contactUsForm = new ContactUsForm<Integer, String>
                (100313, "Andrew Kan");
        contactUsForm.showFormInfo();

    }
}

