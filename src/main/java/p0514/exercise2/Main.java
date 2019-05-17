package p0514.exercise2;

import p0507.Owner;
import p0514.Bank;
import p0514.Exercise3;
import p0514.exercise1.Invoice;
import p0514.exercise1.Utils;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Owner> owners = p0508.Main.getListOfOwners();

        List<Payment> payments = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Client client = new Client(owners.get(i), "LT77 " + Utils.getRandomLong());
                payments.add(client);
            } else {
                Employee employee = new Employee(owners.get(i) ,"LT77 " + Utils.getRandomLong());
                employee.setBankAccount("LT77 " + Utils.getRandomLong());
                payments.add(employee);
            }
//            System.out.println(payments.get(i).accountOwner() + " " + payments.get(i).getClass().getSimpleName());
//            System.out.println("Account number: " + payments.get(i).bankAccount());
//            System.out.println("Amount: " + payments.get(i).amount());
//            System.out.println();
        }

        System.out.println("Before payment: " + payments.get(0).amount());
        BigDecimal price = new BigDecimal("10.00");
        int quantity = 34;

        payment(
                (Client) payments.get(0),
                (Employee) payments.get(1),
                print(quantity, price)
        );
        System.out.println("After payment: " + payments.get(0).amount());


    }

    public static BigDecimal print(int q, BigDecimal pricePVM) {
        BigDecimal p = new BigDecimal(1.21);
        BigDecimal quantity = new BigDecimal(q);

        BigDecimal priceWithoutPVM = pricePVM.divide(p, BigDecimal.ROUND_HALF_UP);
        BigDecimal priceAll = pricePVM.divide(p, BigDecimal.ROUND_HALF_UP).multiply(quantity);
        BigDecimal sumPVM = pricePVM.subtract(priceWithoutPVM).multiply(quantity);
        BigDecimal sumTotal = pricePVM.multiply(quantity);


        // prekės kaina be PVM (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("Prekes kaina be PVM: %1$, .2f EUR", priceWithoutPVM));

        // kiekis
        System.out.println("Kiekis: " + quantity);

        // suma be PVM (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("Suma be PVM: %1$, .2f EUR", priceAll));

        // PVM suma (tikslumas 2 ženklai po kablelio)
        System.out.println(String.format("PVM suma: %1$, .2f EUR", sumPVM));

        // viso suma su PVM (tikslumas 2 ženklai po kablelio).
        System.out.println(String.format("Viso suma su PVM: %1$, .2f EUR", sumTotal));
        return sumTotal;
    }

    public static void payment(Client who, Employee toWhom, BigDecimal howMuch) {
        toWhom.setAmount(toWhom.amount().add(howMuch));
        who.setAmount(who.amount().subtract(howMuch));
    }
}
