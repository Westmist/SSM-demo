package com.lcc.controller;

import com.lcc.dao.StudentDao;
import com.lcc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller("dynQuery")
public class DynQuery {
    @Autowired
    private StudentDao studentDao;

    public void test() {
        Student student = new Student();
        // 查找表中student_name字段中带"明"且age=12的数据行
        student.setStudent_name("明");
        student.setStudent_age(12);
        List<Student> studentList = studentDao.queryByIf(student);
        for (Student student1 :
                studentList) {
            System.out.println(student1.toString());
        }
        /* 如果student_name不为空就查询带'小'的信息
         * 如果student_age大于18，就查询student_age匹配的信息
         * 否则就执行otherwise查询student_id>0的信息(整张表)
         * 相当于switch(自上向下只匹配一项)
         */
        Student student2 = new Student();
        student2.setStudent_name("");
        student2.setStudent_age(19);
        List<Student> studentList1 = studentDao.queryByWhen(student2);
        System.out.println("——————When查询——————");
        for (Student student3 :
                studentList1) {
            System.out.println(student3.toString());
        }

        /* where会忽略开头的and和or，所以使用where可以不用谢 'where 1=1'
         * 若全部的if都不匹配则返回整表
         */
        Student student4 = new Student();
        student4.setStudent_name("s");
        student4.setStudent_age(19);
        List<Student> studentList2 = studentDao.queryByWhere(student4);
        System.out.println("——————Where查询——————");
        for (Student student5 :
                studentList2) {
            System.out.println(student5.toString());
        }

        // 使用bind可以解决不同数据库连接符实现不一致的问题
        Student student6 = new Student();
        student6.setStudent_name("明");
        List<Student> studentList3 = studentDao.queryByBind(student6);
        System.out.println("——————Bind使用——————");
        for (Student student7 :
                studentList3) {
            System.out.println(student7.toString());
        }

        /* foreach 迭代一个集合
         * 查询 student_age 匹配List中的值的信息
         */
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(18);
        List<Student> studentList4 = studentDao.queryByFore(list);
        System.out.println("——————foreach使用——————");
        for (Student student8 :
                studentList4) {
            System.out.println(student8.toString());
        }
    }
}
