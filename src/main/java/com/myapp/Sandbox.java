package main.java.com.myapp;

import main.java.com.myapp.comparator.DogSizeComparator;
import main.java.com.myapp.model.Dog;

import java.util.Arrays;
import java.util.function.DoubleFunction;

public class Sandbox {

    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog(Dog.M, "4"),
                new Dog(Dog.S, "1"),
                new Dog(Dog.XL, "6"),
                new Dog(Dog.XL, "2"),
                new Dog(Dog.XS, "3"),
                new Dog(Dog.S, "5")
        };

        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog : dogs) {
            System.out.println(dog.getSize() + "\t" + dog.getAge());
        }
    }

}
