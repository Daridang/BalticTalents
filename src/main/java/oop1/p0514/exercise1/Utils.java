package oop1.p0514.exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static long getRandomLong() {
        return ThreadLocalRandom.current().nextLong(999999999999L, System.currentTimeMillis());
    }

    public static LocalDate getRandomDate(long randomLong) {
        Date date = new Date(randomLong);
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static BigDecimal getRandomBigDecimal() {
        return new BigDecimal(ThreadLocalRandom.current().nextDouble() * ThreadLocalRandom.current()
                .nextInt(100, 10000)).setScale(2, RoundingMode.HALF_UP);
    }
}
