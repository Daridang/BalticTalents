package p0507;

import java.util.Arrays;

/**
 * Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8, 5, 3}.
 * Raskite kiekvieno masyvo skaičių vidurkį ir atspausdinkite jų skirtumą
 * (atimant iš didesniojo mažesnįjį).
 */
public class LoopsMain {

    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        double dA = average(a);
        double dB = average(b);

        if (dA > dB) {
            System.out.println(dA - dB);
        } else {
            System.out.println(dB - dA);
        }
    }

    private static double average(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}
