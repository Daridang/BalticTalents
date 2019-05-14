package p0509.weekendexercise;

public class Son extends FamilyMember implements Driver {
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return getAge() >= 18;
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
