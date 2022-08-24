package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import com.solvd.onlineshop.processes.buyingproducts.BuyingProducts;
import com.solvd.onlineshop.processes.buyingproducts.OrderDetails;
import com.solvd.onlineshop.processes.partnership.Partnership;
import com.solvd.onlineshop.processes.signingup.SignUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static Logger MAIN_LOGGER = LogManager.getLogger(Main.class);

    public static void mainPage() throws IOException {
        Integer choice;

        do {
            Scanner scanner = new Scanner(System.in);

            MAIN_LOGGER.info("Hi! Choose your next step:" + '\n' +
                    "1) Sign up a new account" + '\n' +
                    "2) Buy products" + '\n' +
                    "3) Open information about me" + '\n' +
                    "4) Partnership" + '\n' +
                    "5) Review our shop" + "\n" +
                    "0) Exit" + '\n' + '\n' +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    SignUp.Registration();
                } else if (choice == 2) {
                    BuyingProducts.buying();
                } else if (choice == 3) {
                    OrderDetails.orderDetails();
                } else if (choice == 4) {
                    Partnership.Choice();
                } else if (choice == 5) {
                    OnlineShop.reviewingShop();
                } else if (choice == 0) {
                    MAIN_LOGGER.info("Exit from the online shop. Have a nice day!");
                    System.exit(0);
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                MAIN_LOGGER.error(e);
            }
        } while (choice != 0);
    }
}


