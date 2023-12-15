package org.yulran.lesson4.hfgd;

@UserTypeAnnotation
class UserType extends User implements DisplayInformation{


    public UserType(String Username,String SecondName,String Email) {
        super(Username, SecondName, Email);
    }

    // Метод для виведення інформації про користувача
    public void displayUserInfo() {
        System.out.println("Інформація користувача:ім'я:"+ Username+"Прізвище:"+ SecondName+"електрона адреса :"+Email);
    }

    @Override
    public void displayAllInfo() {//

    }

    @Override
    public void displayPersonalInfo() {

    }
}

class UserTypeAnnotationDefaults {
    public static int defaultActivityLevel() {
        return UserTypeAnnotationDefaults.class.getAnnotation(UserTypeAnnotation.class).defaultActivityLevel();
    }

    public static boolean defaultPremiumStatus() {
        return UserTypeAnnotationDefaults.class.getAnnotation(UserTypeAnnotation.class).defaultPremiumStatus();
    }
}