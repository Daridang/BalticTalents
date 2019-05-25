package oop1.p0513;

import oop1.p0507.Car;
import oop1.p0507.Owner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//
//- Išveskite automobilius sulygiuotus pagal savininko pavardės raidžių skaičių
// (naudokite String length). Panaudoti anoniminę klasę.

//- Išveskite automobilius sulygiuotus pagal savininko vardo paskutinę raidę
// (naudokite String charAt). Panaudoti vidinę statinę klasę.

//- Išveskite automobilius sulygiuotus pagal autmobilio numerio skaičius
// (numerio formatas <3 raidės><tarpas><3 skaičiai>). Panaudoti vidinę paprastą klasę.

public class Main {
    public static void main(String[] args) throws IOException {

        // Ex. 1 ===============================================
        Integer[] arr = {-10, 0, 2, 9, -5};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.asList(arr);
        list.forEach(integer -> System.out.print(integer + " "));

        list.sort((o1, o2) -> {
            if (o1 < o2) {
                return o1;
            } else {
                return o2;
            }
        });
        list.forEach(integer -> System.out.print(integer + " "));
        System.out.println("\n");

        // End of Ex. 1 =========================================

        // Ex. 2 ================================================

        List<Owner> owners = oop1.p0508.Main.getListOfOwners();
        List<Car> cars = new ArrayList<>();
        String[] models = {"Mercury", "Dodge", "Lexus", "Kia", "Toyota", "Toyota", "Jeep", "Honda", "Nissan", "Mazda"};
        String[] make = {"Lynx", "Ram Van 2500", "IS", "Amanti", "Tacoma", "Avalon", "Grand Cheroke", "Accord", "Xterra", "Mazda3"};
        String[] regNums = {"ABC 123", "CDE 456", "FGH 789", "IJK 234", "LMN 567", "OPR 891", "STU 345", "VXY 678", "ZAB 910", "CDE 112"};

        for (int i = 0; i < 4; i++) {
            cars.add(new Car(owners.get(i), models[i], make[i], regNums[i]));
        }

        ComparingByNames cbn = (owners1, cars1) -> {

            // Comparing by last name length.
            cars1.stream()
                    .sorted(Comparator.comparingInt(o -> o.getOwner().getLastName().length()))
                    .forEach(System.out::println);
        };
        System.out.println("Comparing by last name length:");
        cbn.compare(owners, cars);

        System.out.println("Comparing by first names last letter:");
        Main.ComparingByFirstNames.compare(cars);

        System.out.println("Comparing by car registration numbers:");
        new Main().new ComparingByRegNums(cars).compare();

    }

    interface ComparingByNames {

        void compare(List<Owner> owners, List<Car> cars);
    }

    static class ComparingByFirstNames {

        // Comparing by first's name last letter.
        static void compare(List<Car> cars) {
            cars.stream()
                    .sorted(Comparator.comparingInt(o -> o.getOwner()
                            .getFirstName()
                            .charAt(o.getOwner().getFirstName().length() - 1)))
                    .forEach(System.out::println);
        }

    }

    class ComparingByRegNums {
        List<Car> cars;

        ComparingByRegNums(List<Car> cars) {
            this.cars = cars;
        }

        // Comparing by car registration numbers.
        void compare() {
            cars.stream().sorted(Comparator.comparingInt(car -> Integer
                    .parseInt(
                            car.getRegistrationNumber()
                                    .substring(car.getRegistrationNumber().length() - 3)
                    ))).forEach(System.out::println);
        }
    }
}
