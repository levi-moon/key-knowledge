package com.levi.java;

/**
 * 试验在for循环中的final关键字
 *
 * @ClassName: AutoIncrement
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/7/7 17:23
 */
public class FinalInFor {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            final int index = i + 1;
            System.out.println(index);
        }
    }
}
