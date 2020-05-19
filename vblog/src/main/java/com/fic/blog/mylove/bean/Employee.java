package com.fic.blog.mylove.bean;

import javax.xml.crypto.Data;
import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private int sex;
    private String birth;

    public Employee(String name, int age, int sex, String birth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
