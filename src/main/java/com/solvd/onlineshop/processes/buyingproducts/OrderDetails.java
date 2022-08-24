package com.solvd.onlineshop.processes.buyingproducts;

import com.solvd.onlineshop.mainshop.Main;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.io.FileUtils.getFile;

public class OrderDetails {
    private final static Logger DETAILS_LOGGER = LogManager.getLogger(OrderDetails.class);

    public static void orderDetails() {
        boolean showOrder = false;
        do {
            try {
                OrderDetails orderDetails = new OrderDetails();
                File userDetails = getFile("src/main/resources/user.txt");
                File paymentDetails = getFile("src/main/resources/payment.txt");
                String user = FileUtils.readFileToString(userDetails, Charsets.toCharset(StandardCharsets.UTF_8));
                String order = FileUtils.readFileToString(paymentDetails, Charsets.toCharset(StandardCharsets.UTF_8));
                DETAILS_LOGGER.info("The information about user: " + "\n" + user);
                DETAILS_LOGGER.info("The information about order: " + "\n" + order);
                showOrder = true;
            } catch (Exception exception) {
                DETAILS_LOGGER.error(exception);
            }
        } while (!showOrder);
        try {
            Main.mainPage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
