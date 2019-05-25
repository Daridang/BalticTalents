package oop1.p0520;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //1.Given a list of integers, return a list where each integer is multiplied by
    // 2.  doubling([1, 2, 3]) → [2, 4, 6]  doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    // doubling([]) → []

    //Given a string of odd length, return the string length 3 from its middle, 
    // so "Candy" yields "and". The string length will be at least 
    // 3.  middleThree("Candy") → "and"  middleThree("and") → "and"  middleThree("solving") → "lvi
    public static void main(String[] args) {
        
        

        //System.out.println(doubling());
    }

    public static List<Integer> doubling(List<Integer> list) {
        return list.stream().map(i -> i * 2).collect(Collectors.toList());
    }

    public static String middleThree(String candy) {
        int middle;
        if (candy != null && candy.length() == 3 && candy.length() % 2 == 1) {
            middle = candy.length() / 2;
            return candy.substring(middle - 1, middle + 2);
        }
        return candy;
    }

    public static List<Integer> noTeen(List<Integer> list) {
        if (list == null) {
            return null;
        }
        return list.stream().filter(integer -> integer > 19 || integer < 13).collect(Collectors.toList());
    }

    //Given a list of integers, return a list of those numbers,
    // omitting any that are between 13 and 19 inclusive.
    // noTeen([12, 13, 19, 20]) → [12, 20]  noTeen([1, 14, 1]) → [1, 1]  noTeen([15]) → []
}

