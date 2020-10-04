package com.lcc.controller;

import com.lcc.dao.StudentDao;
import com.lcc.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller("userController")
public class UserController {
    @Qualifier("studentDao")
    @Autowired
    private StudentDao studentDao;
    public void test(){
        //添加用户
        Student student1 = new Student();
        student1.setName("明轩");
        student1.setAge(18);
        Student student2 = new Student();
        student2.setName("旧时光");
        student2.setAge(23);
        studentDao.addUser(student1);
        studentDao.addUser(student2);

        // 查询单个用户
        try{
            Student student3 = studentDao.queryOne(1);
            if (student3 != null){
                System.out.println("名字："+student3.getName());
            }
        } catch (Exception e){
            e.printStackTrace();
        }


        // 修改用户信息
        Student student4 = new Student();
        student4.setName("旧时光");
        // 挥别旧时光
        student4.setAge(0);
        int modifyCount = studentDao.modify(student4);
        System.out.println(modifyCount+"条信息被修改！");

        // 查询数据表信息
        System.out.println("——————整表信息——————");
        List<Student> studentList = studentDao.queryAll();
        for (Student student:
             studentList) {
            System.out.println("姓名："+student.getName());
        }


        // 删除用户 (此处删除主键大于0的数据即清空数据表)
        int deleteCount = studentDao.deleteUser(0);
        System.out.println(deleteCount+"条信息被删除!");
    }
}
