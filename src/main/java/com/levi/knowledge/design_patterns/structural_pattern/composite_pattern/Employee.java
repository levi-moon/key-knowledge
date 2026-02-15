package com.levi.knowledge.design_patterns.structural_pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: Employee
 * @Description: 职工
 * @Author: Levi
 * @Date: 2026/2/14 15:03
 * @Version: 1.0
 */
public class Employee {

    // 姓名
    private String name;
    // 部门
    private String dept;
    // 薪水
    private int salary;
    // 下级
    private List<Employee> subordinates;

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    // 添加下级
    public void add(Employee e) {
        subordinates.add(e);
    }

    // 移除下级
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    // 获取下级
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
