package com.lbg.entity;

import java.util.Date;

public class Student {
    private long student_id;
    private String name;
    private String sex;
    private String major;
    private int age;
    private long telephone_number;
    private Date birthday;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(long telephone_number) {
        this.telephone_number = telephone_number;
    }
    /* getter and setter */

    public long getStudent_id() {
        return (Long)student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
