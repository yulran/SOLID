package org.yulran.lesson4.hfgd;

import org.yulran.lesson4.hfgd.Interfaces.BaseBankAccount;
import org.yulran.lesson4.hfgd.Interfaces.ICurrency;
import org.yulran.lesson4.Users.User;

public class BankAccount extends BaseBankAccount {

    private final User owner;
    protected double balance;
    private double interestRate;//
    private double creditLimit;
    private ICurrency Icurrency;
    public BankAccount(User owner, ICurrency Icurrency, double initialBalance) {
        super( owner,  Icurrency,  initialBalance);
        this.owner = owner;
        this.Icurrency = Icurrency;
        this.balance = initialBalance;
        this.interestRate = 0.0;
        this.creditLimit = 0.0;

    }


   // public void displayAccountInfo() {
     //   System.out.println("Інформація про банківський рахунок:");
     //   System.out.println("Власник: " + owner.getUsername());
      //  System.out.println("Баланс: " + balance + " " +Icurrency);
       // System.out.println("Процентна ставка: " + interestRate + "%");
      //  System.out.println("Кредитний ліміт: " + creditLimit + " " +Icurrency);
    //}
    public void addMoney(double amount) {
        balance += amount;
        System.out.println("Внесено: " + amount + " " + Icurrency);
    }
    public void setCreditLimit(double newLimit) {
        creditLimit = newLimit;
        System.out.println("Кредитний ліміт оновлено: " + newLimit + " " + Icurrency);

    }
    public void landMoney(double amount) {
        if (balance - amount >= creditLimit) {
            balance -= amount;
            System.out.println("Знято: " + amount + " " +Icurrency);
        } else {
            System.out.println("Недостатньо коштів для зняття.");
        }
    }
    public void setInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Процентна ставка оновлена: " + newRate + "%");
    }
    public void changeCurrency(double exchangeRate, ICurrency Icurrency) {
        double newBalance = balance * exchangeRate;
        System.out.println("Баланс у новій валюті (" + Icurrency + "): " + newBalance);
    }

    public User getOwner() {
        return owner;
    }



}
