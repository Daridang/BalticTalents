package oop1.p0516;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[] {1, 2};
//        int[] arr2 = new int[] {3, 4};
//        System.out.println(Arrays.toString(plusTwo(arr, arr2)));
//
//        int[] arr = new int[] {3, 1, 4};
//        System.out.println(Arrays.toString(square56(arr)));

//        Given a list of integers, return a list of those numbers squared and the product added to 10,
//        omitting any of the resulting numbers that end in 5 or 6.
////        square56([3, 1, 4]) → [19, 11]
////        square56([1]) → [11]
////        square56([2]) → [14]
        String[] models = {"Mercury", "Dodge", "Lexus", "Kia", "Toyota", "Toyota", "Jeep", "Honda", "Nissan", "Mazda"};

        List<String> strings = Arrays.asList("a", "bb", "ccc");
        System.out.println(copies3(strings));
//        Given a list of strings, return a list where each string is replaced by 3
//        copies of the string concatenated together.
//        copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
//        copies3(["24", "a", ""]) → ["242424", "aaa", ""]
//        copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    }

    static List<String> copies3(List<String> list) {
//        List<String> tempList = new ArrayList<>();
//        for (String s : list) {
//            tempList.add(s + s  + s);
//        }
        return list.stream().map(s -> s + s + s).collect(toList());
    }

    private static void buyFood() throws HungryException {

    }

    static Integer[] square56(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i] * arr[i] + 10;
            if ( item % 10 == 5 || item % 10 == 6) {
                continue;
            }
            temp.add(item);
        }
        Integer[] tem = new Integer[temp.size()];
        temp.toArray(tem);
        return tem;
    }

    static int[] plusTwo(int[] arr, int[] arr2) {
        int[] temp = new int[4];
        temp[0] = arr[0];
        temp[1] = arr[1];
        temp[2] = arr2[0];
        temp[3] = arr2[1];
        return temp;
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, temp, 0, arr1.length);
        System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
        return temp;
    }
}
