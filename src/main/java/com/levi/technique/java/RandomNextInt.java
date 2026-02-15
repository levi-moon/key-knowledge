package com.levi.technique.java;

import java.util.Random;

/**
 * 测试random.nextInt
 */
public class RandomNextInt {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int rn = random.nextInt(3);
            System.out.println(rn);
        }
    }
}
