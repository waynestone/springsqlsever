package com.wayne.entity;

import java.util.Date;

/**
 * Created by YiTao on 2017/3/17.
 */
public class person {
    private Integer number;
    private String name;
    private Date birthday;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
