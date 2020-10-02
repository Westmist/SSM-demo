package com.lcc.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// 数据库操作接口的实现类
@Repository("studentDaoImpl")
public class studentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int update(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    @Override
    public List<Student> query(String sql, Object[] param) {
        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setId(resultSet.getInt("student_id"));
                student.setName(resultSet.getString("student_name"));
                student.setAge(resultSet.getInt("student_age"));
                return student;
            }
        };
        return jdbcTemplate.query(sql, rowMapper, param);
    }
}
