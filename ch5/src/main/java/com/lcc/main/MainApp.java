package com.lcc.main;

import com.lcc.mybatis.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            // 根据配置文件构建 sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
            // 通过 sqlSessionFactory 创建 sqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 添加用户
            Student student = new Student();
            student.setStudent_name("明轩");
            student.setStudent_age(18);
            // 字符串参数为映射文件中的mapper标签的namespace+sql标签id
            sqlSession.insert("com.lcc.mapper.StudentMapper.addUser", student);
            Student student1 = new Student();
            student1.setStudent_name("玛卡巴卡");
            student1.setStudent_age(9);
            sqlSession.insert("com.lcc.mapper.StudentMapper.addUser", student1);

            // 查询单个用户
            Student student2 = sqlSession.selectOne("com.lcc.mapper.StudentMapper.selectOne", 1);
            System.out.println("姓名：" + student.getStudent_name());

            // 修改用户信息
            Student student3 = new Student();
            student3.setStudent_age(18);
            student3.setStudent_name("玛卡巴卡");
            sqlSession.update("com.lcc.mapper.StudentMapper.modifyUser", student3);

            // 查询所有用户
            List<Student> studentList = sqlSession.selectList("com.lcc.mapper.StudentMapper.selectAll");
            System.out.println("——————数据表信息——————");
            for (Student student4 :
                    studentList) {
                System.out.println("姓名："+student4.getStudent_name());
            }

            // 删除用户(删除主键大于0的数据，清空数据表)
            sqlSession.delete("com.lcc.mapper.StudentMapper.deleteUser",0);

            // 提交事务
            sqlSession.commit();
            // 关闭 sqlSession
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}