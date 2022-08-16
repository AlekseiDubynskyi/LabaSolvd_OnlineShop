package com.solvd.onlineshop.mainshop;

import com.solvd.onlineshop.processes.partnership.Partner;
import com.solvd.onlineshop.processes.partnership.Seller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllData {
    private static final Logger DATA_LOGGER = LogManager.getLogger(AllData.class);

    public static void data(){
        addSeller();
        addParner();
    }

    private static void addSeller(){
        Seller seller = new Seller();

        Seller seller1 = new Seller("John", "+1-613-555-0107", "Ontario",
                "9d623b5a-59db-435b-9c3e-0cfb2a149c5e");
        Seller seller2 = new Seller("Mike", "+1-202-555-0114", "Boston",
                "1d25be50-5fdf-4311-89eb-7767de46e361");

        seller.addSeller(seller1);
        seller.addSeller(seller2);
    }

    private static void addParner(){
        Partner partner = new Partner();

        Partner partner1 = new Partner("Roody", "+36 55 352 913",
                "7c95c8b6-14b4-46c7-9aa6-555a6b1715af");
        Partner partner2 = new Partner("Hanna", "+61 1900 654 321",
                "455be649-8398-4dd5-adf6-c6023e980fa8");

        partner.addPartner(partner1);
        partner.addPartner(partner2);
    }
}
