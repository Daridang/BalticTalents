package p0507;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Jonas", "Jonaitis");
        Car car1 = new Car(owner1);
        car1.setMaxSpeed(200);
        car1.setRegistrationNumber(234);

        Owner owner2 = new Owner("John", "Johnson");
        RacingCar racingCar = new RacingCar(owner2);
        racingCar.setMaxSpeed(340);
        racingCar.setRegistrationNumber(7474);

        System.out.println(car1);
        System.out.println(racingCar);
    }
}
