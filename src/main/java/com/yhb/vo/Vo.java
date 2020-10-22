package com.yhb.vo;

import lombok.Data;

import java.io.Serializable;


public class Vo implements Serializable {


    private static final long serialVersionUID = -8224317790454208759L;

    private int id;
    private String name;
    private String age;
    private int size;

    @Override
    public String toString() {
        return "Vo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", size=" + size +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Vo() {
    }

    public Vo(int id, String name, String age, int size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.size = size;
    }
}
