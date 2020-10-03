package com.lcc.dao;


/*
* 数据库接口
* */
public interface TranscationDao {
    public int save(String sql, Object[] param);
    public int delete(String sql, Object[] param);
}
