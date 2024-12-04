package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        if (currency instanceof AustralianDollar){
            return AUSTRALIAN_DOLLAR;
        } else if (currency instanceof Euro){
            return EURO;
        }else if (currency instanceof Ringgit){
            return RINGGIT;
        }
        else if (currency instanceof CanadianDollar) {
            return CANADIAN_DOLLAR;
        } else if (currency instanceof ChineseYR){
            return CHINESE_YR;
        } else if (currency instanceof Franc){
            return FRANC;
        }else if(currency instanceof Pound){
            return POUND;
        } else if (currency instanceof Rupee){
            return RUPEE;
        } else if (currency instanceof SingaporeDollar){
            return SINGAPORE_DOLLAR;
        }else if (currency instanceof UniversalCurrency){
            return UNIVERSAL_CURRENCY;
        } else if (currency instanceof USDollar){
            return  US_DOLLAR;
        }else if (currency instanceof Yen){
            return YEN;
        } else {

            return null;
        }
    }
}
