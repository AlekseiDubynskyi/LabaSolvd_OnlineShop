package com.solvd.onlineshop;

import com.solvd.onlineshop.mainshop.WelcomeMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.Field;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(com.solvd.onlineshop.mainshop.Main.class);
    public static void main(String args[]) {
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
        LOGGER.info(greetings);
        try {
            com.solvd.onlineshop.mainshop.Main.mainPage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
