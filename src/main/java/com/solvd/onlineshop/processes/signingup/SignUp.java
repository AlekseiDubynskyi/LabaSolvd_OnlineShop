package com.solvd.onlineshop.processes.signingup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.*;


public class SignUp {
    private static final Logger REGISTER_LOGGER = LogManager.getLogger(SignUp.class);

    public static void Registration() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        REGISTER_LOGGER.info("Enter First Name: ");
        String firstName = scanner.nextLine();
        user.setFirstName(firstName);

        REGISTER_LOGGER.info("Enter Last Name: ");
        String lastName = scanner.nextLine();
        user.setLastName(lastName);

        REGISTER_LOGGER.info("Enter Password: ");
        String password = scanner.nextLine();
        user.setPassword(password);

        REGISTER_LOGGER.info("Enter your email: ");
        String email = scanner.nextLine();
        user.setEmail(email);

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

        REGISTER_LOGGER.info(user.toString());
    }
}