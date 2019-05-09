package p0507;

public class Owner {
    private String first_name;
    private String last_name;

    public Owner() {}

    public Owner(String firstName, String lastName) {
        first_name = firstName;
        last_name = lastName;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                '}';
    }
}
