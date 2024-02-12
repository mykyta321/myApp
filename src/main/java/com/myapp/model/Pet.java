package main.java.com.myapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Pet {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthState healthState;
    final LocalDateTime registrationTime = LocalDateTime.now();

    @Override
    public String toString() {
        return  "\n\ttype: " + type
                + ", sex: " + sex
                + ", age: " + age
                + ", name: " + name
                + ", owner name: " + ownerName
                + ", health state: " + healthState;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Pet pet = (Pet) obj;
        return Objects.equals(type, pet.type)
                && Objects.equals(sex, pet.sex)
                && Objects.equals(age, pet.age)
                && Objects.equals(name, pet.name)
                && Objects.equals(ownerName, pet.ownerName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, ownerName);
    }

    public enum HealthState {
        CRITICAL(0),
        UNKNOWN(1),
        MODERATE(2),
        NORMAL(3);

        private final int value;

        HealthState(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
