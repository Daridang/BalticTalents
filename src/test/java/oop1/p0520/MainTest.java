package oop1.p0520;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    // 2.  doubling([1, 2, 3]) → [2, 4, 6]  doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]

    @Test
    public void doubling() {
        List<Integer> expected = Arrays.asList(2, 4, 6) ;
        List<Integer> actual = Main.doubling(Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);

        expected = Arrays.asList(12, 16, 12, 16, -2) ;
        actual = Main.doubling(Arrays.asList(6, 8, 6, 8, -1));
        assertEquals(expected, actual);
    }

    //Given a string of odd length, return the string length 3 from its middle,
    // so "Candy" yields "and". The string length will be at least
    // 3.  middleThree("Candy") → "and"  middleThree("and") → "and"  middleThree("solving") → "lvi
    @Test
    public void middleThree() {
        String actual = Main.middleThree("Candy");
        assertEquals("and", actual);

        actual = Main.middleThree("");
        assertEquals("", actual);

        actual = Main.middleThree(null);
        assertEquals(null, actual);

        actual = Main.middleThree("abcd");
        assertEquals("abcd", actual);

        actual = Main.middleThree("a");
        assertEquals("a", actual);

        actual = Main.middleThree("abc");
        assertEquals("abc", actual);


    }

    //Given a list of integers, return a list of those numbers,
    // omitting any that are between 13 and 19 inclusive.
    // noTeen([12, 13, 19, 20]) → [12, 20]  noTeen([1, 14, 1]) → [1, 1]  noTeen([15]) → []
    @Test
    public void noTeen() {
        List<Integer> expected = Arrays.asList(12, 20);
        List<Integer> actual = Main.noTeen(Arrays.asList(12, 13, 19, 20));
        assertEquals(expected, actual);

        expected = Arrays.asList(1, 1);
        actual = Main.noTeen(Arrays.asList(1, 14, 1));
        assertEquals(expected, actual);

        actual = Main.noTeen(Arrays.asList(15));
        assertEquals(0, actual.size());

        actual = Main.noTeen(null);
        assertNull(null, actual);
    }
}