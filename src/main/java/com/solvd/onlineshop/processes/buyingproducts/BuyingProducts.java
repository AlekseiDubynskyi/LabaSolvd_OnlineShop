package com.solvd.onlineshop.processes.buyingproducts;

import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import com.solvd.onlineshop.mainshop.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static com.solvd.onlineshop.processes.buyingproducts.ProductsDatabase.*;

public class BuyingProducts {
    private final static Logger BUYING_LOGGER = LogManager.getLogger(BuyingProducts.class);

    public static void Buying() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Product> laptops = new ArrayList<Product>();
            ArrayList<Product> smartphones = new ArrayList<Product>();
            ArrayList<Product> washingMachines = new ArrayList<Product>();
            ArrayList<Product> sneakers = new ArrayList<Product>();
            ArrayList<Product> guitars = new ArrayList<Product>();

            BUYING_LOGGER.info("Choose the category:" + '\n' +
                    "1) Laptops" + '\n' +
                    "2) Smartphones" + '\n' +
                    "3) Washing machines" + '\n' +
                    "4) Sneakers" + '\n' +
                    "5) Guitars" + "\n" +
                    "9) Make an order" + "\n" +
                    "0) Back" + '\n' + "\n" +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    Laptops();
                    BuyingProcess();
                    break;
                } else if (choice == 2) {
                    Smartphones();
                    BuyingProcess();
                    break;
                } else if (choice == 3) {
                    WashingMachines();
                    BuyingProcess();
                    break;
                } else if (choice == 4) {
                    Sneakers();
                    BuyingProcess();
                    break;
                } else if (choice == 5) {
                    Guitars();
                    BuyingProcess();
                    break;
                } else if (choice == 9) {
                    MakeOrder.makingOrder();
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
        } while (choice != 1 || choice != 2 || choice != 3 || choice != 4 || choice != 5 || choice != 9 || choice != 0);
    }

    public static void BuyingProcess() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);

            BUYING_LOGGER.info("Do you want to buy something here?" + '\n' +
                    "1) Yes, make an order." + '\n' +
                    "2) No, return me to the Category page." + '\n' +
                    "3) No, return me to the Main page." + '\n' + "\n" +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    MakeOrder.makingOrder();
                    break;
                } else if (choice == 2) {
                    Buying();
                    break;
                } else if (choice == 3) {
                    BUYING_LOGGER.info("Exit from the Buying page. Now you are at the Home page!");
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                BUYING_LOGGER.error(e);
            }
        } while (choice != 3);
    }
}
