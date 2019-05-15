package p0514.exercise2;

import p0507.Owner;
import p0514.exercise1.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Owner> owners = p0508.Main.getListOfOwners();

        List<Payment> payments = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Client client = new Client(owners.get(i));
                client.setBankAccount("LT77 " + Utils.getRandomLong());
                payments.add(client);
            } else {
                Employee employee = new Employee(owners.get(i));
                employee.setBankAccount("LT77 " + Utils.getRandomLong());
                payments.add(employee);
            }
            System.out.println(payments.get(i).accountOwner());
            System.out.println("Account number: " + payments.get(i).bankAccount());
            System.out.println();
        }
    }
}
