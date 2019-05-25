package oop1.p0509.weekendexercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FamilyMember> family1 = new ArrayList<>();
        family1.add(new Father("Jonas", 40));
        family1.add(new Mother("Jolanta", 35));
        family1.add(new Son("Jonelis", 18));
        family1.add(new Daughter("Jole", 15));

        List<FamilyMember> family2 = new ArrayList<>();
        family2.add(new Father("Jonas2", 34));
        family2.add(new Mother("Jolanta2", 31));
        family2.add(new Son("Jonelis2", 11));
        family2.add(new Dog("Sparky", 5));

        FamilyStats stats = new FamilyStats(family1);
        System.out.println("Family members who can drive all transport:");
        stats.canDriveAllTransport();

        System.out.println("\nDrivers in family:");
        stats.countDrivers();

        System.out.println("\nCount family members:");
        stats.countFamilyMembers();

        System.out.println("\nGet family average age:");
        stats.getAverageAge();

        System.out.println("\nOldest member:");
        stats.getOldestFamilyMember();

        System.out.println("\nFull stats:");
        stats.fullStats();

        FamilyStats stats2 = new FamilyStats(family2);
        System.out.println("Family members who can drive all transport:");
        stats2.canDriveAllTransport();

        System.out.println("\nDrivers in family:");
        stats2.countDrivers();

        System.out.println("\nCount family members:");
        stats2.countFamilyMembers();

        System.out.println("\nGet family average age:");
        stats2.getAverageAge();

        System.out.println("\nOldest member:");
        stats2.getOldestFamilyMember();

        System.out.println("\nFull stats:");
        stats2.fullStats();
    }
}
