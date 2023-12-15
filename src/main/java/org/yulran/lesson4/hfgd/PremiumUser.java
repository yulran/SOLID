package org.yulran.lesson4.hfgd;

import java.util.ArrayList;

@UserTypeAnnotation(defaultPremiumStatus = true)
public class PremiumUser extends UserType implements AccountCounter,DisplayInformation{
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
@Override
    public void displayAllInfo() {
    System.out.println("імя  :" +Username+ " фамилия  :"+SecondName+ "статус  :"+ isPremium);
        System.out.println("Інформація про преміум-користувача: " +
                "Статус преміум = " + isPremium);
    }




    @Override
    public void addtoMyAcounts(BankAccount bankAccount ){
        MyAccounts.add(bankAccount);
    }

    }


