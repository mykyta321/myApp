package main.java.com.myapp.model;

public class Cat extends Pet{
    @Override
    public String toString() {
        return super.toString().concat("\nRegistration time: " + registrationTime.format(FORMATTER) + "\n");
    }
}
