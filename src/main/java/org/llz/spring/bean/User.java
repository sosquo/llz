package org.llz.spring.bean;

import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 功能：用户实体类
 */


public class User {
    private int id;
    private String username;
    private String password;
    private String telephone;
    private Date registerTime;
    private int popedom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getPopedom() {
        return popedom;
    }

    public void setPopedom(int popedom) {
        this.popedom = popedom;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", registerTime=" + registerTime +
                ", popedom=" + popedom +
                '}';
    }
}

