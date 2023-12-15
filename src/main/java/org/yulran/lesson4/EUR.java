package org.yulran.lesson4;

import org.yulran.lesson4.hfgd.ICurrency;

public class EUR extends Currency implements ICurrency {

    public EUR(String type, double exchangeRate) {
        super(type, exchangeRate);
    }

    @Override
    public void changeCurrency(String type, double exchangeRate) {
        this.type = type;
        this.exchangeRate = exchangeRate;

    }
}
