package com.lcc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("player")           //参数相当于Bean配置的ID
public class Player {
    @Value("gamer")           // 相当于setter()方法
    private String ID;
    @Value("99")
    private int level;

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
}
