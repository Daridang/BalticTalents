package p0514.exercise1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {

    private LocalDate localDate;
    private String client;
    private BigDecimal sum;

    public Invoice(LocalDate localDate, String client, BigDecimal sum) {
        this.localDate = localDate;
        this.client = client;
        this.sum = sum;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "localDate=" + localDate +
                ", client='" + client + '\'' +
                ", sum=" + sum +
                '}';
    }
}
