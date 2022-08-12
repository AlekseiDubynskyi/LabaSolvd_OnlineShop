package com.solvd.onlineshop.processes;

import com.solvd.onlineshop.processes.partnership.partner.Partner;
import com.solvd.onlineshop.processes.partnership.seller.Seller;
import com.solvd.onlineshop.exceptions.InvalidChoiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.UUID;

public class Partnership {
    private final static Logger PARTNERSHIP_LOGGER = LogManager.getLogger(Partnership.class);

    public static void Choice() {
        int choice;
        do {
            Scanner scanner = new Scanner(System.in);

            PARTNERSHIP_LOGGER.info("You want to be a part of our team as a:" + '\n' +
                    "1) Seller" + '\n' +
                    "2) Partner" + '\n' +
                    "0) Back" + '\n' + '\n' +
                    "Make your choice:");
            choice = scanner.nextInt();

            try {
                if (choice == 1) {
                    Partnership.toBeASeller();
                    break;
                } else if (choice == 2) {
                    Partnership.toBeAPartner();
                    break;
                } else if (choice == 0) {
                    PARTNERSHIP_LOGGER.info("Exit from the Partnership page. Now you are at the Home page!");
                    break;
                } else {
                    throw new InvalidChoiceException("Invalid entering data. Please enter one of the provided numbers.");
                }
            } catch (InvalidChoiceException e) {
                PARTNERSHIP_LOGGER.error(e);
            }
        } while (choice != 1 || choice != 2 || choice != 0);
    }

    private static void toBeASeller() {
        Scanner scanner = new Scanner(System.in);
        String nameSeller;
        String contactSeller;
        String city;
        String setID = UUID.randomUUID().toString();

        PARTNERSHIP_LOGGER.info("Enter your Full Name: ");
        nameSeller = scanner.nextLine();

        PARTNERSHIP_LOGGER.info("Enter your Contact: ");
        contactSeller = scanner.nextLine();

        PARTNERSHIP_LOGGER.info("Enter the City from where you will sell products: ");
        city = scanner.nextLine();

        Seller seller = new Seller(nameSeller, contactSeller, city, setID);

        PARTNERSHIP_LOGGER.info("Dear, " + new Seller(nameSeller, contactSeller, city, setID));
    }


    public static void toBeAPartner() {
        Scanner scanner = new Scanner(System.in);
        String namePartner;
        String contactPartner;
        String setID = UUID.randomUUID().toString();

        PARTNERSHIP_LOGGER.info("Enter your Full Name: ");
        namePartner = scanner.nextLine();

        PARTNERSHIP_LOGGER.info("Enter your Contact: ");
        contactPartner = scanner.nextLine();

        Partner partner = new Partner(namePartner, contactPartner, setID);

        PARTNERSHIP_LOGGER.info("Dear, " + new Partner(namePartner, contactPartner, setID));
    }
}
