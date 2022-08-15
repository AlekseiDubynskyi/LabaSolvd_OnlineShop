package com.solvd.onlineshop.processes.signingup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.*;


public class SignUp {
    private static final Logger REGISTER_LOGGER = LogManager.getLogger(SignUp.class);

    public static User Registration() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        boolean firstName_Validation = false;
        boolean lastName_Validation = false;
        boolean password_Validation = false;
        boolean email_Validation = false;

        do {
            REGISTER_LOGGER.info("Enter your first name: ");
            String firstName = scanner.nextLine();
            if (firstName.matches("[A-Z][a-z]+")) {
                user.setFirstName(firstName);
                firstName_Validation = true;
            } else {
                REGISTER_LOGGER.info("Please use a capital letter for the first letter of the first name.");
            }
        } while (firstName_Validation != true);

        do {
            REGISTER_LOGGER.info("Enter your last name: ");
            String lastName = scanner.nextLine();
            if (lastName.matches("[A-Z][a-z]+")) {
                user.setLastName(lastName);
                lastName_Validation = true;
            } else {
                REGISTER_LOGGER.info("Please use a capital letter for the first letter of the last name.");
            }
        } while (lastName_Validation != true);

        do {
            REGISTER_LOGGER.info("Enter the password: ");
            String password = scanner.nextLine();
            if (password.length() >= 8) {
                user.setPassword(password);
                password_Validation = true;
            } else {
                REGISTER_LOGGER.info("Password must have at least 8 characters.");
            }
        } while (password_Validation != true);

        do {
            REGISTER_LOGGER.info("Enter your email: ");
            String email = scanner.nextLine();
            if (email.matches("^[a-zA-Z\\d_#$%&’*+/=?^.-]+(?:\\.[a-zA-Z0-9_+&*-]+)" +
                    "*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
                user.setEmail(email);
                email_Validation = true;
            } else {
                REGISTER_LOGGER.info("Please enter the valid email address.");
            }
        } while (email_Validation != true);

        final String fromEmail = "onlineshop.sending.message@gmail.com"; //requires valid gmail id
        // correct password for gmail id, passwd creates on gmail account after two-factor authentication
        final String passwd = "vbrvgdtajibtjsgr";
        final String toEmail = user.getEmail(); // user input email

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        props.put("mail.smtp.port", "465"); //SMTP Port

        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, passwd);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);
        EmailUtil.sendEmail(session, toEmail, "Successfully registration on OnlineShop project!",
                "We are very grateful to you for registering!\n" +
                        "Dear " + user.getFirstName() + " " + user.getLastName() +
                        ", have a good shopping in our store!\n" + "\n" +
                        "Sincerely, OnlineShop.");

        return user;
    }

}