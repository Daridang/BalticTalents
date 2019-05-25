package oop1.p0514.exercise1;

import oop1.p0514.exercise2.Client;

import java.math.BigDecimal;
import java.time.LocalDate;

//1. Sukurkite sąskatas-faktūras aprašančią klasę, kurioje būtų sąskaitpos datos laukas
// (LocalDate), kliento laukas (klasė arba tik String tipo) ir sumos laukas (BigDecimal).
//        Sukurkite sąrašą tokių įrašų su skirtingomis datomis ir sumomis.
//        Parašykite metodą kuris iš sąrašo suformuoja kitą sąrašą -
//        ataskaitą parodančią kokios yra pajamos pagal ketvirčius.

public class Invoice {

    private LocalDate localDate;
    private Client client;
    private BigDecimal amount;

    public Invoice(LocalDate localDate, Client client, BigDecimal amount) {
        this.localDate = localDate;
        this.client = client;
        this.amount = amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Client getClient() {
        return client;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "localDate=" + localDate +
                ", client='" + client + '\'' +
                ", amount=" + amount +
                '}';
    }
}
