package main.fpij.cap4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class Ex4CalculateNavTest {

    @Test
    public void computeStock(){
        final CalculateNav calculateNav =
                new CalculateNav(ticker -> new BigDecimal("6.01"));
        BigDecimal expected = new BigDecimal("6010.00");
        Assertions.assertEquals(0, calculateNav.computeStockWorth("G00G",1000)
                .compareTo(expected));

    }

}
