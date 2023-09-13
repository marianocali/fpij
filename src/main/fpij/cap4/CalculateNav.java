package main.fpij.cap4;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNav {

    private Function<String,BigDecimal> priceFinder;
    public BigDecimal computeStockWorth(final String ticker, final int shares){
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }

    public CalculateNav(final Function<String,BigDecimal> priceFinder){
        this.priceFinder = priceFinder;
    }

}
