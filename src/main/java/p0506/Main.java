package p0506;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] range = IntStream.rangeClosed(1, 10).toArray();

        int[] bonus = IntStream.rangeClosed(11, 25).toArray();

        System.out.println(sumFirstFive(range));

        System.out.println(sumLastThree(range));

        System.out.println(Arrays.toString(mergeArrays(range, bonus)));

        printArrays(range, bonus, mergeArrays(range, bonus));

    }

    private static void printArrays(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println("While cycle: ");
        int i = 0;
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        System.out.println("\nFor cycle: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }

        System.out.println("\nForeach cycle (merged arrays): ");
        for (int k : arr3) {
            System.out.print(k + " ");
        }
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, temp, 0, arr1.length);
        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        return temp;
    }

    private static int sumLastThree(int[] arr) {
        System.out.println("\nSum last three numbers: ");
        int sum = 0;
        int[] temp = Arrays.copyOfRange(arr, 97, 100);
        for (int i1 : temp) {
            sum += i1;
            System.out.println(sum + " " + i1);
        }
        return sum;
    }

    private static int sumFirstFive(int[] arr) {
        System.out.println("\nSum first five odd numbers: ");
        int sum = 0;
        int counter = 0;
        //int[] temp = Arrays.copyOfRange(arr, 0, 10);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                counter++;
                System.out.println(arr[i] + " sum: " + sum);
            }

            if (counter == 5) {
                break;
            }
        }
        return sum;
    }
}