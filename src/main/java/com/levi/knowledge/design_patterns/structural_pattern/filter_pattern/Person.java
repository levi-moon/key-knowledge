package com.levi.knowledge.design_patterns.structural_pattern.filter_pattern;

/**
 * @Class: Person
 * @Description: 人对象类，应用标准
 * @Author: Levi
 * @Date: 2026/2/14 09:42
 * @Version: 1.0
 */
public class Person {

    // 姓名
    private String name;
    // 性别
    private String gender;
    // 婚姻状况
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
