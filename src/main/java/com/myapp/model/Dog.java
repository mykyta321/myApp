package main.java.com.myapp.model;

import java.util.Objects;

public class Dog extends Pet{

    private Size size;

    public Dog () { };
    public Dog(Size size) {
        this.size = size;
    }
    public Dog(Size size, String age) {
        this.size = size;
        this.setAge(age);
    }
    public Dog(Size size, String age, HealthState healthState) {
        this.size = size;
        this.setAge(age);
        this.setHealthState(healthState);
    }

    @Override
    public String toString() {
        return super.toString().concat(", size: " + size).concat("\nRegistration time: " + registrationTime.format(FORMATTER) + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public enum Size {
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0)
        ;

        private final int value;

        Size(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
