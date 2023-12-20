package org.yulran.lesson4.Users;

import org.yulran.lesson4.hfgd.BankAccount;
import org.yulran.lesson4.hfgd.Interfaces.AccountCounter;
import org.yulran.lesson4.hfgd.UserType;
import org.yulran.lesson4.hfgd.UserTypeAnnotationDefaults;

import java.util.ArrayList;

@UserTypeAnnotation(defaultPremiumStatus = true)
public class PremiumUser extends UserType implements AccountCounter {
ArrayList<BankAccount> MyAccounts= new ArrayList<>();///
    private boolean isPremium;
    public PremiumUser(String Username, String SecondName,String Email,boolean isPremium) {
        super(Username,SecondName,Email);
        this.isPremium = UserTypeAnnotationDefaults.defaultPremiumStatus();
    }



    public void changePremiumStatus(boolean newStatus) {
        this.isPremium = newStatus;
        System.out.println("Статус преміум-користувача оновлено: " + newStatus);
    }

  //




    @Override
    public void addtoMyAcounts(BankAccount bankAccount ){
        MyAccounts.add(bankAccount);
    }

    }


