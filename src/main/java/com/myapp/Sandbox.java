package main.java.com.myapp;
import main.java.com.myapp.model.Dog;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.DoubleFunction;

public class Sandbox {

    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog(Dog.Size.M, "4"),
                new Dog(Dog.Size.S, "1"),
                new Dog(Dog.Size.XL, "6"),
                new Dog(Dog.Size.XL, "2"),
                new Dog(Dog.Size.XS, "3"),
                new Dog(Dog.Size.S, "5")
        };

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int dogSizeCompare = o1.getSize().getValue() - o2.getSize().getValue();
                int dogAgeCompare = o1.getAge().compareTo(o2.getAge());
                return (dogSizeCompare == 0) ? dogAgeCompare : dogSizeCompare;
            }
        });

        for (Dog dog : dogs) {
            System.out.println(dog.getSize() + "\t" + dog.getAge());
        }
    }

}
