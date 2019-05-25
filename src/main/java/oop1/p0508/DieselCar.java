package oop1.p0508;

import oop1.p0507.Owner;

public class DieselCar extends Car {

    private final String fuelType = "Diesel";

    public DieselCar () {}

    public DieselCar(Owner owner) {
        super(owner);
    }

    public DieselCar(int registrationNumber, int maxSpeed, Owner owner, String model) {
        super(registrationNumber, maxSpeed, owner, model);
    }

    @Override
    String getFuelType() {
        return fuelType;
    }
}
