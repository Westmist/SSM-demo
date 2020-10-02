package com.lcc.Transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StudentDao studentDao = (StudentDao) context.getBean("studentDaoImpl");

        // 添加学生信息
        String insertSQL = "INSERT INTO student_tbl VALUES (null,?,?)";
        Object param[] = {"明轩","18"};
        Object param1[] = {"怡宝","17"};
        studentDao.update(insertSQL,param);
        studentDao.update(insertSQL,param1);

        // 修改学生信息
        String modifySQL = "UPDATE student_tbl SET student_age = ? WHERE student_age = ?";
        Object param2[] = {"18","17"};
        studentDao.update(modifySQL,param2);

        // 查找学生信息
        String querySQL = "SELECT * FROM student_tbl";
        List<Student> studentsList = studentDao.query(querySQL,null);
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()){
            System.out.println("学生姓名："+iterator.next().getName());
        }

        // 删除学生信息
        String deleteSQL = "DELETE FROM student_tbl WHERE student_age = ?";
        Object param4[] = {"18"};
        studentDao.update(deleteSQL,param4);
    }
}