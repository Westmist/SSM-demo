package com.lcc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("transcationDao")
public class TranscationDaoImpl implements TranscationDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(String sql, Object[] param) {
        return jdbcTemplate.update(sql,param);
    }

    @Override
    public int delete(String sql, Object[] param) {
         return jdbcTemplate.update(sql,param);
    }
}
