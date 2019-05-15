package p0514.exercise2;

import p0507.Owner;

public class Employee implements Payment {

    private String bankAccount;
    private Owner owner;

    public Employee(Owner owner) {
        this.owner = owner;
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
    public void amount(double amount) {

    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
