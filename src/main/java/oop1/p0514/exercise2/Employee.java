package oop1.p0514.exercise2;

import oop1.p0507.Owner;
import oop1.p0514.exercise1.Invoice;
import oop1.p0514.exercise1.Utils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee implements Payment {

    private String bankAccount;
    private Owner owner;
    private BigDecimal amount;

    public Employee(Owner owner) {
        this.owner = owner;
    }

    public Employee(Owner owner, String bankAccount) {
        this.owner = owner;
        this.bankAccount = bankAccount;
        amount = Utils.getRandomBigDecimal();
    }

    @Override
    public String bankAccount() {
        return bankAccount;
    }

    @Override
    public Owner accountOwner() {
        return owner;
    }

    @Override
    public BigDecimal amount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Invoice makeInvoice(LocalDate date, Client client, BigDecimal amount) {
        return new Invoice(date, client, amount);
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "bankAccount='" + bankAccount + '\'' +
                ", owner=" + owner +
                '}';
    }
}
