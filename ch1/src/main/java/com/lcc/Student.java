package com.lcc;

import java.util.List;

// 使用xml配置的Bean类
public class Student {
    private String name;
    private int age;
    private List<String> interest;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setInterest(List interest) {
        this.interest = interest;
    }
    public List getInterest() {
        return interest;
    }
}
