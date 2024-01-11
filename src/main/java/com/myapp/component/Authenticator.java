package main.java.com.myapp.component;

import main.java.com.myapp.Main;

public class Authenticator {

    private static String PASSWORD = "p";

    public static boolean auth() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = Main.SCANNER.nextLine();

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

}
