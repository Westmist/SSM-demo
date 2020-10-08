package com.lcc.pojo;

public class User {

    private String name;
    private String password;
    private Integer age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }
}
