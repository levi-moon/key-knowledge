package com.levi.java;

/**
 * 试验自增自减的加号、减号在前后的区别
 *
 * @ClassName: AutoIncrement
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/7/7 17:23
 */
public class AutoIncrement {

    public static void main(String[] args) {
        // ++ 在后，先返回当前值，再自增
        int a = 1;
        System.out.println(a++); // 1

        // ++ 在前，先自增，再返回新的值
        int b = 1;
        System.out.println(++b); // 2

        // ++ 在后，虽然先返回当前值再自增，但最终的结果仍然是加一后的结果
        int c = 1;
        c++;
        System.out.println(c); // 2

        // ++ 在前，先自增，再返回新的值
        int d = 1;
        ++d;
        System.out.println(d); // 2
    }
}
