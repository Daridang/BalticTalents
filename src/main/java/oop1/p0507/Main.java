package oop1.p0507;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Jonas", "Jonaitis");
        Car car1 = new Car(owner1);
        car1.setMaxSpeed(200);

        Owner owner2 = new Owner("John", "Johnson");
        RacingCar racingCar = new RacingCar(owner2);
        racingCar.setMaxSpeed(340);

        System.out.println(car1);
        System.out.println(racingCar);
    }
}
