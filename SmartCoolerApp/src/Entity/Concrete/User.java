package Entity.Concrete;

import Entity.Abstract.Entity;



public class User implements Entity {
    String userName;
    String password;
    public User(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
