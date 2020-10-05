package com.lcc.dao;

import com.lcc.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("studentDao")
@Mapper
public interface StudentDao {
    public List<Student> queryByIf(Student student);
    public List<Student> queryByWhen(Student student);
    public List<Student> queryByWhere(Student student);
    public List<Student> queryByBind(Student student);
    public List<Student> queryByFore(List<Integer> integers);
}
