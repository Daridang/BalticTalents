package oop1.p0514.exercise1;


import org.threeten.extra.YearQuarter;
import oop1.p0514.exercise2.Client;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Invoice> invoices = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            invoices.add(new Invoice(
                            Utils.getRandomDate(Utils.getRandomLong()),
                            new Client(
                                    oop1.p0508.Main.getListOfOwners().get(i),
                                    "LT77" + Utils.getRandomLong()
                            ),
                            Utils.getRandomBigDecimal()
                    )
            );
        }

        invoices.sort(
                (o1, o2) -> (int) (o1.getLocalDate().toEpochDay() - o2.getLocalDate().toEpochDay())
        );

        YearQuarter currentQuarter = YearQuarter.from(invoices.get(0).getLocalDate());
        System.out.println(currentQuarter);

        List<Invoice> temp = new ArrayList<>();
        for (Invoice invoice : invoices) {
            if (YearQuarter.from(invoice.getLocalDate()).equals(currentQuarter)) {
                temp.add(invoice);
            } else {
                printReport(currentQuarter, temp);
                currentQuarter = YearQuarter.from(invoice.getLocalDate());
                temp.clear();
            }
        }
    }

    private static void printReport(YearQuarter quarter, List<Invoice> invoices) {

        BigDecimal sum = invoices.stream()
                .map(Invoice::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Quarter " + quarter + ":");

        invoices.forEach(System.out::println);

        System.out.println(sum + "$\n");
    }
}
