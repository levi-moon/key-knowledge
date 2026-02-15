package com.levi.knowledge.design_patterns.structural_pattern.composite_pattern;

/**
 * @Class: CompositePatternDemo
 * @Description: 组合模式
 * @Author: Levi
 * @Date: 2026/2/14 15:05
 * @Version: 1.0
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        // 创建CEO
        Employee CEO = new Employee("John","CEO", 30000);

        // 创建销售主管
        Employee headSales = new Employee("Robert","Head Sales", 20000);

        // 创建市场主管
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        // 创建店员
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        // 创建销售经理
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println("打印CEO：");
        System.out.println(CEO);
        System.out.println("\n==============\n");
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println("打印领导层：");
            System.out.println(headEmployee);
            System.out.println("\n+++++++++++++++++\n");
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println("打印领导层的下级：");
                System.out.println(employee);
            }
            System.out.println("\n------------------\n");
        }
    }
}
