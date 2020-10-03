package com.lcc.service;

import com.lcc.dao.TranscationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("actionService")
public class ActionServiceImpl implements ActionService {
    @Autowired
    private TranscationDao transcationDao;
    // 调用Dao层

    @Override
    public void action() {
        String deleteSQL = "DELETE FROM student_tbl";
        String saveSQL = "INSERT INTO student_tbl VALUES(?,?,?)";
        Object[] param = {"1", "明轩", "18"};
        //先清空数据表
        transcationDao.delete(deleteSQL, null);
        try {
            // 添加两条主键重复的数据
            transcationDao.save(saveSQL, param);
            transcationDao.save(saveSQL, param);
        } catch (Exception e) {
            System.out.println("主键重复，事务回滚");
            e.printStackTrace();
        }
    }
}
