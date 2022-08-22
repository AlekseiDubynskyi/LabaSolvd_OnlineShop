package com.solvd.onlineshop.processes.buyingproducts;

import com.solvd.onlineshop.mainshop.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ProductsDatabase {
    private final static Logger DATABASE_LOGGER = LogManager.getLogger(ProductsDatabase.class);
    public static void Laptops() {
        List<Product> laptops = new ArrayList<Product>();
        laptops.add(new Product("LP-01", "Precision 5560", "Dell", 1824.34));
        laptops.add(new Product("LP-02", "MacBook Pro M1", "Apple", 2699));
        laptops.add(new Product("LP-03", "EliteBook 840 G8", "HP", 1049.95));
        laptops.forEach(laptop -> DATABASE_LOGGER.info(laptop));
    }

    public static void Smartphones() {
        List<Product> smartphones = new ArrayList<Product>();
        smartphones.add(new Product("ST-01", "iPhone 13 Pro Max", "Apple", 1799));
        smartphones.add(new Product("ST-02", "Pixel 6", "Google", 999.12));
        smartphones.add(new Product("ST-03", "Galaxy S22 Ultra", "Samsung",
                1569));
        smartphones.forEach(smartphone -> DATABASE_LOGGER.info(smartphone));
    }

    public static void WashingMachines() {
        List<Product> washingMachines = new ArrayList<Product>();
        washingMachines.add(new Product("WM-01", "EFLS627", "Electrolux", 1449));
        washingMachines.add(new Product("WM-02", "WM3900", "LG", 1200));
        washingMachines.add(new Product("WM-03", "WF45R6100A", "Samsung", 1049));
        washingMachines.forEach(washingMachine -> DATABASE_LOGGER.info(washingMachine));
    }

    public static void Sneakers() {
        List<Product> sneakers = new ArrayList<Product>();
        sneakers.add(new Product("SN-01", "Adizero Adios Pro 2", "Adidas", 220));
        sneakers.add(new Product("SN-02", "Adapt Auto Max", "Nike", 325));
        sneakers.add(new Product("SN-03", "Paradigm 6", "Altra", 170));
        sneakers.forEach(sneaker -> DATABASE_LOGGER.info(sneaker));
    }

    public static void Guitars() {
        List<Product> guitars = new ArrayList<Product>();
        guitars.add(new Product("GT-01", "Bullet Mustang", "Squier", 351));
        guitars.add(new Product("GT-02", "Classic Vibe '60s Stratocaster", "Squier",
                219));
        guitars.add(new Product("GT-03", "G5222 6", "Gretsch", 235.51));
        guitars.forEach(guitar -> DATABASE_LOGGER.info(guitar));
    }
}
