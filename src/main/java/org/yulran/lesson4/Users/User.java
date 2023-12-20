package org.yulran.lesson4.Users;

public abstract class User  {//


    public  String Username;
    public  String SecondName;
    public  String Email;

public User(String Username, String SecondName,String Email){
    this.Username=Username;
    this.SecondName=SecondName;
    this.Email=Email;
}
    public String getUsername() {
        return Username;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getEmail() {
        return Email;
    }
}





