package com.solvd.onlineshop.processes;

import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import com.solvd.onlineshop.mainshop.Product;
import com.solvd.onlineshop.shoppingorders.ShoppingOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

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
                    MakeOrder();
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

    public static void Laptops() {
        List<Product> laptops = new ArrayList<Product>();
        laptops.add(new Product("LP-01", "Precision 5560", "Dell", 1824.34));
        laptops.add(new Product("LP-02", "MacBook Pro M1", "Apple", 2699));
        laptops.add(new Product("LP-03", "EliteBook 840 G8", "HP", 1049.95));
        BUYING_LOGGER.info(laptops);
    }

    public static void Smartphones() {
        List<Product> smartphones = new ArrayList<Product>();
        smartphones.add(new Product("ST-01", "iPhone 13 Pro Max", "Apple", 1799));
        smartphones.add(new Product("ST-02", "Pixel 6", "Google", 999.12));
        smartphones.add(new Product("ST-03", "Galaxy S22 Ultra", "Samsung",
                1569));
        BUYING_LOGGER.info(smartphones);
    }

    public static void WashingMachines() {
        List<Product> washingMachines = new ArrayList<Product>();
        washingMachines.add(new Product("WM-01", "EFLS627", "Electrolux", 1449));
        washingMachines.add(new Product("WM-02", "WM3900", "LG", 1200));
        washingMachines.add(new Product("WM-03", "WF45R6100A", "Samsung", 1049));
        BUYING_LOGGER.info(washingMachines);
    }

    public static void Sneakers() {
        List<Product> sneakers = new ArrayList<Product>();
        sneakers.add(new Product("SN-01", "Adizero Adios Pro 2", "Adidas", 220));
        sneakers.add(new Product("SN-02", "Adapt Auto Max", "Nike", 325));
        sneakers.add(new Product("SN-03", "Paradigm 6", "Altra", 170));
        BUYING_LOGGER.info(sneakers);
    }

    public static void Guitars() {
        List<Product> guitars = new ArrayList<Product>();
        guitars.add(new Product("GT-01", "Bullet Mustang", "Squier", 351));
        guitars.add(new Product("GT-02", "Classic Vibe '60s Stratocaster", "Squier",
                219));
        guitars.add(new Product("GT-03", "G5222 6", "Gretsch", 235.51));
        BUYING_LOGGER.info(guitars);
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
                    MakeOrder();
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

    public static void MakeOrder() {
        ShoppingOrder shoppingOrder = new ShoppingOrder();
        double countTotalPrice = 0;


        String choice;
        do {
            Scanner scanner = new Scanner(System.in);

            BUYING_LOGGER.info("Enter the ID of the product to add it to the shopping cart: ");
            choice = scanner.nextLine();


            try {
                if (choice == "") {
                    MakeOrder();
                    break;
                } else if (choice == "2") {
                    Buying();
                    break;
                } else if (choice == "3") {
                    BUYING_LOGGER.info("Exit from the Buying page. Now you are at the Home page!");
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                BUYING_LOGGER.error(e);
            }
        } while (true);

    }

}
