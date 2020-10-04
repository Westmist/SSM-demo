package com.lcc.po;

// 持久化类，与数据表信息保持一致
public class Student {
    private int student_id;
    private String student_name;
    private int student_age;

    public void setId(int student_id) {
        this.student_id = student_id;
    }

    public int getId() {
        return student_id;
    }

    public void setName(String student_name) {
        this.student_name = student_name;
    }

    public String getName() {
        return student_name;
    }

    public void setAge(int student_age) {
        this.student_age = student_age;
    }

    public int getAge() {
        return student_age;
    }

}
