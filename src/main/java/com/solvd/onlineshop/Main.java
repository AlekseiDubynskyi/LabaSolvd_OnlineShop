package com.solvd.onlineshop;

import com.solvd.onlineshop.companies.Departments;
import com.solvd.onlineshop.companies.Partners;
import com.solvd.onlineshop.companies.Sellers;
import com.solvd.onlineshop.location.City;
import com.solvd.onlineshop.location.Country;
import com.solvd.onlineshop.mainshop.Category;
import com.solvd.onlineshop.mainshop.OnlineShop;
import com.solvd.onlineshop.mainshop.Product;
import com.solvd.onlineshop.people.Customer;
import com.solvd.onlineshop.people.Employees;
import com.solvd.onlineshop.shoppingorders.Deliveries;
import com.solvd.onlineshop.shoppingorders.Payment;
import com.solvd.onlineshop.shoppingorders.ShoppingOrder;
import com.solvd.onlineshop.shoppingorders.TransactionReports;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
       final Logger LOGGER = LogManager.getLogger(Main.class);



    }
}
   /*// Instances
        Country country = new Country("Canada");
        City city = new City("Alfred, Ontario", "K0B 1A0");
        Departments departments = new Departments("OnlineShop Department", "+14845219652", city,
                "UO-101", country);
        Partners partners = new Partners("Dell", "+1384009152", city, "DE-101");
        Sellers sellers = new Sellers("ID-100001");
        Category category = new Category("C-04", "Laptops");
        OnlineShop onlineShop = new OnlineShop("Best Shop", "+3310039414",
                new City("Vancouver", "VAN 3VO"), "LID-341444");
        Product product = new Product("DL-1031331",category, "Dell Latitude 14 5420", sellers);
        Customer customer = new Customer("John", "Peterson", "+40099324244",
                "JP-4009100001", "Great address to live");
        Employees employees = new Employees("Oliver", "Davidson", "+313908719749", onlineShop,
                "Administrator");
        ShoppingOrder shoppingOrder = new ShoppingOrder();
        Deliveries deliveries = new Deliveries();
        Payment payment = new Payment();
        TransactionReports transactionReports = new TransactionReports();
        */