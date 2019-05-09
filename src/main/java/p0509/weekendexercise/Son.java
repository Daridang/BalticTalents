package p0509.weekendexercise;

public class Son extends FamilyMember implements Driver {
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        if (getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
