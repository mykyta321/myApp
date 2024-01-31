package main.java.com.myapp;
import main.java.com.myapp.model.Cat;
import main.java.com.myapp.model.Client;
import main.java.com.myapp.model.Dog;
import main.java.com.myapp.model.Pet;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.DoubleFunction;

public class Sandbox {

    public static void main(String[] args) {

        /*Dog[] dogs = {
                new Dog(Dog.Size.M, "4", Pet.HealthState.CRITICAL),
                new Dog(Dog.Size.S, "1", Pet.HealthState.NORMAL),
                new Dog(Dog.Size.XL, "6", Pet.HealthState.MODERATE),
                new Dog(Dog.Size.XL, "2", Pet.HealthState.CRITICAL),
                new Dog(Dog.Size.XS, "3", Pet.HealthState.UNKNOWN),
                new Dog(Dog.Size.S, "5", Pet.HealthState.NORMAL)
        };

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int dogHealthStateCompare = o1.getHealthState().getValue() - o2.getHealthState().getValue();
                int dogAgeCompare = o2.getAge().compareTo(o1.getAge());
                return (dogHealthStateCompare == 0) ? dogAgeCompare : dogHealthStateCompare;
            }
        });

        for (Dog dog : dogs) {
            System.out.println(dog.getSize() + "\t" + dog.getAge() + "\t" + dog.getHealthState());
        }*/
        ////

        System.out.println(new Cat());
        System.out.println(new Client());
    }

}
