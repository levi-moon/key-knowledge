package com.levi.technique.java;

import java.math.BigDecimal;

/**
 * 试验乘法、除法
 *
 * @ClassName: AutoIncrement
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/7/7 17:23
 */
public class BigDecimalDivide {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(6010);
        BigDecimal b = new BigDecimal(33966);
        BigDecimal r = a.divide(b,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(r); // 0.18
        System.out.println(a.multiply(new BigDecimal(100)).divide(b,2,BigDecimal.ROUND_HALF_UP)); // 17.69
    }
}
