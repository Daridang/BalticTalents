package p0509.weekendexercise;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FamilyStats {

    private List<FamilyMember> family;

    public FamilyStats(List<FamilyMember> family) {
        this.family = family;
    }

    public void countFamilyMembers() {
        System.out.println(family.size() + " members in this family.");
    }

    public void countDrivers() {
        System.out.println(family.stream().filter(fm -> fm instanceof Driver).count());
    }

    public void canDriveAllTransport() {
        family.stream()
                .filter(fm -> fm instanceof Driver)
                .filter(fm -> ((Driver) fm).canDriveCar() && ((Driver) fm).canRideBike())
                .forEach(System.out::println);
    }

    public void getOldestFamilyMember() {
        System.out.println(family.stream().max((o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return o1.getAge();
            } else {
                return o2.getAge();
            }
        }));
    }

    public void getAverageAge() {
        System.out.println(family.stream().collect(Collectors.averagingInt(FamilyMember::getAge)));
    }

    public void fullStats() {
        System.out.println(
                family.stream().collect(Collectors.summarizingInt(FamilyMember::getAge))
        );
    }
}
