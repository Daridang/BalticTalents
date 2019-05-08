package p0507;

public class Car {

    private int registrationNumber;
    private int maxSpeed;
    private Owner owner;

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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
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
                '}';
    }
}
