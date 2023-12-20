package org.yulran.lesson4.hfgd;

import org.yulran.lesson4.hfgd.Interfaces.BaseBankAccount;
import org.yulran.lesson4.hfgd.Interfaces.DisplayAccountInformation;
import org.yulran.lesson4.hfgd.Interfaces.DisplayUserInformation;
import org.yulran.lesson4.hfgd.Interfaces.ICurrency;
import org.yulran.lesson4.Users.User;

public class Displayer implements DisplayAccountInformation, DisplayUserInformation {
    private static Displayer instance;
    private ICurrency currency;

   private User user;
   private BaseBankAccount bankAccount;
private Displayer(User user,ICurrency currency,BaseBankAccount bankAccount){
    this.user=user;
    this.bankAccount=bankAccount;
    this.currency=currency;
}
    public static Displayer getInstance(){
        if (instance == null) {

            instance=new Displayer();
        }
        return instance;
    }
    @Override
    public void displayAllAccountInfo() {
        System.out.println("Інформація про банківський рахунок:");
        System.out.println("Власник: " + user.getUsername());
        System.out.println("Баланс: " + balance + " " +Icurrency);
        System.out.println("Процентна ставка: " + interestRate + "%");
        System.out.println("Кредитний ліміт: " + creditLimit + " " +Icurrency);
    }

    @Override
    public void displayAllInfoUser() {
        System.out.println("імя  :" +user.getUsername()+ " фамилия  :"+user.getSecondName()+ "статус  :"+ user.getClass());

    }
}
