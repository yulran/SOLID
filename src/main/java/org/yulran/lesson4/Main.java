package org.yulran.lesson4;

import org.yulran.lesson4.hfgd.BankAccount;
import org.yulran.lesson4.hfgd.ICurrency;
import org.yulran.lesson4.hfgd.PremiumUser;
import org.yulran.lesson4.hfgd.USD;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static ICurrency Icurrency;//



    public static void main(String[] args) {
       USD usd =new USD("USD",0.1);
       EUR eur =new EUR("EUR", 0.85);
        PremiumUser SashaP= new PremiumUser("Sasha","Dobryv","sasha.mail",true);
        BankAccount myAccount = new BankAccount(SashaP,eur, 1000.0);

        // SashaP.addtoMyAcounts( new BankAccount(SashaP,usd,1500.0));
        myAccount.addMoney(150.0);
        myAccount.landMoney(500.0);
        myAccount.setInterestRate(3);
        myAccount.setCreditLimit(20000.0);
        myAccount.changeCurrency(0.1,usd);
        myAccount.displayAccountInfo();

        BankAccount secondAccount2=new BankAccount(SashaP,usd,1500.0);
        secondAccount2.changeCurrency(0.85,eur);
        }
    }
