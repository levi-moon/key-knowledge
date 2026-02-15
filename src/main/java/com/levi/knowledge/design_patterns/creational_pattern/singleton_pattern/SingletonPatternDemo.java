package com.levi.knowledge.design_patterns.creational_pattern.singleton_pattern;

/**
 * @ClassName: SingletonPatternDemo
 * @Description: 单例模式demo
 * @Author: Levi
 * @Date: 2025/12/18 8:26
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 Singleton1() 是不可见的
//        Singleton1 singleton1 = new Singleton1();

        // 懒汉式，线程不安全
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.showMessage();

        // 懒汉式，线程安全
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();

        // 饿汉式
        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.showMessage();

        // 双检锁
        Singleton4 singleton4 = Singleton4.getSingleton();
        singleton4.showMessage();

        // 静态内部类（登记式）
        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.showMessage();

        // 枚举
        Singleton6 singleton6 = Singleton6.INSTANCE;
        singleton6.showMessage();
    }
}
