package p0508;

import p0507.Owner;

public class PetrolCar extends Car {

    private final String fuelType = "Petrol";

    public PetrolCar() {}

    public PetrolCar(Owner owner) {
        super(owner);
    }

    public PetrolCar(int registrationNumber, int maxSpeed, Owner owner, String model) {
        super(registrationNumber, maxSpeed, owner, model);
    }

    @Override
    String getFuelType() {
        return fuelType;
    }
}
