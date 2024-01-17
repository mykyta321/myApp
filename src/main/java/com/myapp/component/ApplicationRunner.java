package main.java.com.myapp.component;

import main.java.com.myapp.model.Client;
import main.java.com.myapp.model.Pet;
import main.java.com.myapp.service.ClientService;
import main.java.com.myapp.service.PetService;

public class ApplicationRunner {

    private final ClientService clientService = new ClientService();
    private final PetService petService = new PetService();

    public void run() {
        if (Authenticator.auth()) {
            Client client = clientService.registerNewClient();

            if (client != null) {
                if (PetService.checkPetReg()) {
                    System.out.println("Adding a new pet.");

                    Pet pet = petService.registerNewPet();
                    client.setPet(pet);
                    pet.setOwnerName(client.getFirstName() + " " + client.getLastName());
                    System.out.println("Pet has been added.");

                    System.out.println(client);
                }
            }
        }
    }
}
