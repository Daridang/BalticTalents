package p0509.weekendexercise;

public class Father extends FamilyMember implements Driver{
    public Father(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveCar() {
        return true;
    }

    @Override
    public boolean canRideBike() {
        return true;
    }
}
