package org.yulran.lesson4;

import org.yulran.lesson4.hfgd.ICurrency;

abstract public class Currency implements ICurrency {

    protected String type;
    protected double exchangeRate;

    public Currency(String type, double exchangeRate) {
        this.type = type;
        this.exchangeRate = exchangeRate;
    }

    public String getType() {
        return type;
    }

    public double getExchangeRate() {
        return exchangeRate;

    }


    @Override
    public void changeCurrency(String type, double exchangeRate) {
        this.type = type;
        this.exchangeRate = exchangeRate;
    }
}



