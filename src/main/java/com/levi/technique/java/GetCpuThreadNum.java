package com.levi.technique.java;

/**
 * 获取cpu核数
 *
 * @author Levi
 * @since 2024/9/4 9:30:11
 */
public class GetCpuThreadNum {

    public static void main(String[] args) {
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num); // 8
    }
}
