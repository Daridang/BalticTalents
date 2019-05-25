package oop1.p0514.exercise2;

import oop1.p0507.Owner;

import java.math.BigDecimal;

public interface Payment {
    String bankAccount();
    Owner accountOwner();
    BigDecimal amount();
}
