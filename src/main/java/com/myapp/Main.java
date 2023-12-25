package main.java.com.myapp;

import java.util.Scanner;

public class Main {

    static String PASSWORD = "pass";

    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }
    static void run() {
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
    }
}