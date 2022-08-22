package com.solvd.onlineshop;

import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import com.solvd.onlineshop.mainshop.WelcomeMessage;
import com.solvd.onlineshop.processes.buyingproducts.BuyingProducts;
import com.solvd.onlineshop.processes.partnership.Partnership;
import com.solvd.onlineshop.processes.signingup.SignUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    private final static Logger MAIN_LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        Integer choice;

        // Reflection usage
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        String greetings = null;
        try {
            Field field = welcomeMessage.getClass().getDeclaredField("greetings");
            field.setAccessible(true);
            greetings = (String) field.get(welcomeMessage);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        MAIN_LOGGER.info(greetings);

        do {
            Scanner scanner = new Scanner(System.in);

            MAIN_LOGGER.info("Hi! Choose your next step:" + '\n' +
                    "1) Sign up a new account" + '\n' +
                    "2) Buy products" + '\n' +
                    "3) Open my shopping orders" + '\n' +
                    "4) Partnership" + '\n' +
                    "0) Exit" + '\n' + '\n' +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    SignUp.Registration();
                } else if (choice == 2) {
                    BuyingProducts.Buying();
                } else if (choice == 3) {
                    MAIN_LOGGER.info("You choose 3");
                } else if (choice == 4) {
                    Partnership.Choice();
                } else if (choice == 0) {
                    MAIN_LOGGER.info("Exit from the online shop. Have a nice day!");
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                MAIN_LOGGER.error(e);
            }
        } while (choice != 0);
    }
}


