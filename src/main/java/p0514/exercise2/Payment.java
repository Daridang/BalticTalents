package p0514.exercise2;

import p0507.Owner;

public interface Payment {
    String bankAccount();
    Owner accountOwner();
    void amount(double amount);
}
