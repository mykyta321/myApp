package main.java.com.myapp.model;

import java.util.Objects;

public class Dog extends Pet{

    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";

    private String size;

    public Dog () { };
    public Dog(String size) {
        this.size = size;
    }
    public Dog(String size, String age) {
        this.size = size;
        this.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString().concat(", size: " + size);
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

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
