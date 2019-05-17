package p0514.exercise2;

import p0507.Owner;

import java.math.BigDecimal;

public interface Payment {
    String bankAccount();
    Owner accountOwner();
    BigDecimal amount();
}
