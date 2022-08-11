package com.solvd.onlineshop.mainshop.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class LoginPage {
    private static Register register = new Register();

    public static void main(String[] args) {
        final Logger REGISTER_LOGGER = LogManager.getLogger(LoginPage.class);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Name => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print("Enter Last Name => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print("Enter Password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print("Enter Phone Number => ");
            long phoneNumber = scanner.nextLong();
            register.setPhoneNumber(phoneNumber);

            REGISTER_LOGGER.info(register.toString());
        }
    }
}