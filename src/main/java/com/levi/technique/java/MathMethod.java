package com.levi.technique.java;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: MathMethod
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/12/19 16:23
 */
@Slf4j
public class MathMethod {

    public static void main(String[] args) {
        pow();
    }

    public static void pow() {
        long num = (long) Math.pow(10, 30);
        log.info("10^30 = {}", num);
        log.info("10^30值的长度：{}", String.valueOf(num).length());
        log.info("10000000000000000000值的长度：{}", "10000000000000000000".length());
    }
}
