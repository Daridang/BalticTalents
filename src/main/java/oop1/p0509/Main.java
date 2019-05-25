package oop1.p0509;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        IntStream.range(1, 1001)
                .filter(Main::isNumPerfect)
                .forEach(value -> System.out.print(value + " It's a perfect number!\n"));

    }

    private static boolean isNumPerfect(int number) {

        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        return temp == number;
    }
}
