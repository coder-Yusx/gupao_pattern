package com.kw.pattern.prototype.deep.serializable;

import java.io.*;
import java.util.Date;

public class Person implements  Serializable{

    private String name;

    private Date birthday;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
