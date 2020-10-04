package com.lcc.dao;

import com.lcc.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
@Mapper
public interface StudentDao {
    // 查询所有用户信息
    public List<Student> queryAll();
    // 查询单一用户
    public Student queryOne(int student_id);
    // 添加用户
    public int addUser(Student student);
    // 修改用户信息
    public int modify(Student student);
    // 删除用户
    public int deleteUser(int student_id);
}
