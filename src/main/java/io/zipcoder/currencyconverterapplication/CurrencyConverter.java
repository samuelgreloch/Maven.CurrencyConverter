package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {

        double sourceCurrencyRate = sourceCurrencyType.convert(targetCurrencyType);


        return sourceCurrencyRate * amountOfBaseCurrency;
    }
}
