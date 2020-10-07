package com.lcc.pojo;

public class User {
    private String user;
    private String password;
    private String reupass;
    public void setUser(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    public void setPassword(String password){
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setReupass(String reupass){
        this.reupass = reupass;
    }


    public String getReupass() {
        return reupass;
    }
}
