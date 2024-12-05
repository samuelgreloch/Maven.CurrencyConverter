package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.Euro;
import io.zipcoder.currencyconverterapplication.currencies.USDollar;

import java.util.Currency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/CurrencyType.getTypeOfCurrency(this).getRate();
    }
}