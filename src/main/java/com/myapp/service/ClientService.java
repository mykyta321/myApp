package main.java.com.myapp.service;

import main.java.com.myapp.Main;
import main.java.com.myapp.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientService {

    private static final String EMAIL_PATTERN = "^[a-zA-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final String NAME_PATTERN = "[A-z-]{3,}";

    public Client registerNewClient() {
        Client client = null;

        System.out.println("Please provide client details.");
        System.out.print("Email: ");
        String email = Main.SCANNER.nextLine();

        if (isEmailValid(email)) {
            client = buildClient(email);
            System.out.println("New client: " + client.getFirstName()
                    + " " + client.getLastName()
                    + " (" + client.getEmail() + ")");

        } else {
            System.out.println("Provided email is invalid.");
        }
        return client;
    }
    private static Client buildClient(String email) {
        Client client = new Client();
        client.setEmail(email);
        Pattern compiledPattern = Pattern.compile(NAME_PATTERN);

        System.out.print("First name: ");
        client.setFirstName(Main.SCANNER.nextLine());
        Matcher matcherF = compiledPattern.matcher(client.getFirstName());
        if (matcherF.find()) {
            System.out.print("Last name: ");
            client.setLastName(Main.SCANNER.nextLine());
            Matcher matcherL = compiledPattern.matcher(client.getLastName());
            if (!matcherL.find()){
                client.setLastName("Invalid lastname! Try again.");
            }
        } else {
            client.setFirstName("Invalid name! Try Again.");
        }
        System.out.print("Location: ");
        String location = Main.SCANNER.nextLine().toUpperCase();
        client.setLocation(Client.Location.valueOf(location));

        return client;
    }

    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
