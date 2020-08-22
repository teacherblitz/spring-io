package com.teacherblitz.beans;

/**
 * Person bean
 * 包含：Setting/Getting
 * 即：可写的/可读的
 *
 * @author teacherblitz
 * @since 2020/7/18
 */
public class Person {

    String name;

    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
