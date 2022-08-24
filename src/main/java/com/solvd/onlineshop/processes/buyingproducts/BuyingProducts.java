package com.solvd.onlineshop.processes.buyingproducts;

import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import com.solvd.onlineshop.exceptions.InvalidEnteringException;
import com.solvd.onlineshop.mainshop.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class BuyingProducts {
    private final static Logger BUYING_LOGGER = LogManager.getLogger(BuyingProducts.class);

    public static void buying() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);

            BUYING_LOGGER.info("Choose the action:" + '\n' +
                    "1) Show products" + "\n" +
                    "2) Make an order" + "\n" +
                    "0) Back" + '\n' + "\n" +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    ProductsDatabase.products();
                    ProductsDatabase.showProducts();
                    buyingProcess();
                    break;
                } else if (choice == 2) {
                    ProductsDatabase.addingProductsToCart();
                    break;
                } else if (choice == 0) {
                    BUYING_LOGGER.info("Exit from the Buying page. Now you are at the Home page!");
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                BUYING_LOGGER.error(e);
            }
        } while (choice != 1 || choice != 2 || choice != 0);
    }

    public static void buyingProcess() {
        int choice;

        do {
            Scanner scanner = new Scanner(System.in);

            BUYING_LOGGER.info("Do you want to buy something here?" + '\n' +
                    "1) Yes, make an order." + '\n' +
                    "2) No, return me to the Buying page." + '\n' +
                    "3) No, return me to the Main page." + '\n' + "\n" +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    ProductsDatabase.addingProductsToCart();
                    break;
                } else if (choice == 2) {
                    buying();
                    break;
                } else if (choice == 3) {
                    BUYING_LOGGER.info("Exit from the Buying page. Now you are at the Home page!");
                    break;
                } else {
                    BUYING_LOGGER.info("Invalid entering data. Please enter one of the provided numbers.");
                    buyingProcess();
                }
            } catch (InvalidEnteringException e) {
                BUYING_LOGGER.error(e);
            }

        } while (choice != 3);
    }
}
