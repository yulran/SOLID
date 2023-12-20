package org.yulran.lesson4.Currencyies;

import org.yulran.lesson4.hfgd.Interfaces.Currency;//
import org.yulran.lesson4.hfgd.Interfaces.ICurrency;

public class USD extends Currency implements ICurrency {
    public USD(String type, double exchangeRate) {
        super(type, exchangeRate);
    }
    @Override
    public void changeCurrency(String type, double exchangeRate) {
        this.type = type;
        this.exchangeRate = exchangeRate;
    }
}
