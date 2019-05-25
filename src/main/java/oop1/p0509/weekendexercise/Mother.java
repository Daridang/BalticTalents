package oop1.p0509.weekendexercise;

public class Mother extends FamilyMember implements Driver{
    public Mother(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return false;
    }

    @Override
    public boolean canRideBike() {
        return false;
    }
}
