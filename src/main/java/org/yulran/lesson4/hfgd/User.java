package org.yulran.lesson4.hfgd;

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

}





