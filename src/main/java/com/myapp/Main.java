package main.java.com.myapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

   static String PASSWORD = "pass";

   static Scanner SCANNER = new Scanner(System.in);
   static String EMAIL_PATTERN = "^[a-zA-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

   static String NAME_PATTERN = "[A-z-]{3,}";

    public static void main(String[] args) {
        run();
    }
    static void run() {
        if (auth()) {
            registerNewClient();
        }
    }


    static boolean auth() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if(PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Check your password.");
            }
        }

        System.out.println(accepted ? "Welcome to myApp!" : "Application has been blocked.");
        
        return accepted;
    }
    static void registerNewClient() {
        System.out.println("Please provide client details.");
        System.out.print("Email: ");
        String email = SCANNER.nextLine();

        if (isEmailValid(email)) {
            Client client = buildClient(email);
            System.out.println("New client: " + client.firstName + " " + client.lastName + " (" + client.email + ")");

        } else {
            System.out.println("Provided email is invalid.");
        }
    }

    static Client buildClient(String email) {
        Client client = new Client();
        client.email = email;
        Pattern compiledPattern = Pattern.compile(NAME_PATTERN);

        System.out.print("First name: ");
        client.firstName = SCANNER.nextLine();
        Matcher matcherF = compiledPattern.matcher(client.firstName);
        if (matcherF.find()) {
            System.out.print("Last name: ");
            client.lastName = SCANNER.nextLine();
            Matcher matcherL = compiledPattern.matcher(client.lastName);
            if (!matcherL.find()){
                client.lastName = "Invalid lastname! Try again.";
            }
        } else {
            client.firstName = "Invalid name! Try Again.";
        }

        return client;
    }

    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}