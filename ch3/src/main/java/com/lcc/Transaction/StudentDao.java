package com.lcc.Transaction;

import java.util.List;

/*
* JDBCTemplate类接口*/
public interface StudentDao {
    //数据库添加，修改，删除操作接口
    public int update(String sql,Object[] param);
    //数据库查询操作接口
    public List<Student> query(String sql,Object[] param);
}
