package p0508;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import p0507.Owner;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Car> cars = new ArrayList<>();
        List<Owner> owners = getListOfOwners();

        for (Owner o : owners) {
            if (o.getFirstName().contains("a")) {
                cars.add(new DieselCar(o));
            } else {
                cars.add(new PetrolCar(o));
            }
        }

        for (Car c : cars) {
            System.out.println(c + " " + c.getFuelType());
        }

        System.out.println(isTriangleValid(2, 5, 7));
    }

    public static List<Owner> getListOfOwners() throws IOException {
        return new Gson().fromJson(
                new FileReader("MOCK_DATA.json"),
                new TypeToken<List<Owner>>(){}.getType()
        );
    }

    private static boolean isTriangleValid(double a, double b, double c) {

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else {
                if (a == b || b == c || c == a) {
                    System.out.println("Isosceles Triangle");
                } else {
                    System.out.println("Scalene Triangle");
                }
            }
            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Right Angle Triangle");
            }
            return true;
        } else {
            System.out.println("Triangle not possible");
            return false;
        }
    }
}
