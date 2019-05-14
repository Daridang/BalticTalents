package p0507;

public class Car {

    private String registrationNumber;
    private int maxSpeed;
    private Owner owner;
    private String model;
    private String make;

    public Car(Owner owner, String model, String make, String registrationNumber) {
        this.owner = owner;
        this.model = model;
        this.make = make;
        this.registrationNumber = registrationNumber;
    }


    public Car() {}

    public Car(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber=" + registrationNumber +
                ", maxSpeed=" + maxSpeed +
                ", owner=" + owner +
                ", model=" + model +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
