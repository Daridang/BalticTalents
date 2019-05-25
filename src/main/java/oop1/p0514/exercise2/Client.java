package oop1.p0514.exercise2;

import oop1.p0507.Owner;
import oop1.p0514.exercise1.Utils;

import java.math.BigDecimal;

public class Client implements Payment {

    private String bankAccount;
    private Owner owner;

    private BigDecimal amount;

    public Client(Owner owner) {
        this.owner = owner;
    }

    public Client(Owner owner, String bankAccount) {
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

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankAccount='" + bankAccount + '\'' +
                ", owner=" + owner +
                '}';
    }
}
