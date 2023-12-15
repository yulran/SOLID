package org.yulran.lesson4.hfgd;

@UserTypeAnnotation(defaultActivityLevel = 5)
public class RegularUser extends UserType implements DisplayInformation{
    private int activityLevel;
    boolean isPremium=false;
    public RegularUser(String Username, String SecondName,String Email,int activityLevel) {
        super(Username,SecondName, Email);
        this.activityLevel = UserTypeAnnotationDefaults.defaultActivityLevel();
    }

    public void changeActivityLevel(int newLevel) {
        this.activityLevel = newLevel;
        System.out.println("Рівень активності оновлено: " + newLevel);
    }
@Override
    public void displayAllInfo() {
    System.out.println("імя  :" +Username+ " фамилия  :"+SecondName+ "статус  :"+ isPremium);
        System.out.println("Інформація про звичайного користувача: " +
                "Рівень активності = " + activityLevel);
    }
}

