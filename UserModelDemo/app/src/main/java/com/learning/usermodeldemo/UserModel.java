package com.learning.usermodeldemo;

import java.io.Serializable;

public class UserModel implements Serializable {


    private String name;

    public UserModel(String name, String password, String emailid) {
        this.name = name;
        this.password = password;
        this.emailid = emailid;
    }

    private String password;
    private String emailid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }
}
