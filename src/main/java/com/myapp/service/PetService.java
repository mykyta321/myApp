package main.java.com.myapp.service;

import main.java.com.myapp.Main;
import main.java.com.myapp.model.Cat;
import main.java.com.myapp.model.Dog;
import main.java.com.myapp.model.Pet;

public class PetService {

    private final static String DOG_TYPE = "dog";
    private final static String CAT_TYPE = "cat";

    public static boolean checkPetReg() {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Do you want to register your pet? (yes / no): ");
            String userInput = Main.SCANNER.nextLine();
            if (userInput.equals("yes")) {
                flag = true;
                break;
            } else if (userInput.equals("no")) {
                break;
            } else {
                System.out.println("Invalid value. You have " + (2-i) + " attempts.");
            }
        }

        return flag;
    }

    public Pet registerNewPet() {
        Pet pet = null;
        System.out.print("Type(dog / cat): ");

        String type = Main.SCANNER.nextLine();

        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)) {
            pet = buildPet(type);
        } else {
            System.out.println("Unknown pet type: " + type);;
        }

        return pet;
    }

    private Pet buildPet(String type) {
        Pet pet = type.equals(CAT_TYPE) ? new Cat() : new Dog();
        pet.setType(type);

        System.out.print("Age: ");
        pet.setAge(Main.SCANNER.nextLine());

        System.out.print("Name: ");
        pet.setName(Main.SCANNER.nextLine());

        System.out.print("Sex (male / female): ");
        pet.setSex(Main.SCANNER.nextLine());

        if (type.equals(DOG_TYPE)) {
            System.out.println("Size (xS / S / M / L / xxL): ");
            ((Dog) pet).setSize(Main.SCANNER.nextLine());
        }

        return pet;
    }
}
