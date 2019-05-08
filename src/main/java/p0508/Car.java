package p0508;

import p0507.Owner;

public abstract class Car {

    private int registrationNumber;
    private int maxSpeed;
    private Owner owner;
    private String model;

    public Car() {
    }

    public Car(Owner owner) {
        this.owner = owner;
    }

    public Car(int registrationNumber, int maxSpeed, Owner owner, String model) {
        this.registrationNumber = registrationNumber;
        this.maxSpeed = maxSpeed;
        this.owner = owner;
        this.model = model;
    }

    abstract String getFuelType();

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber=" + registrationNumber +
                ", maxSpeed=" + maxSpeed +
                ", owner=" + owner +
                ", model='" + model + '\'' +
                '}';
    }
}
