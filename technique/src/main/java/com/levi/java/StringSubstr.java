package com.levi.java;

/**
 * 字符串截取
 *
 * @ClassName: StringSubstr
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/7/31 10:07
 */
public class StringSubstr {

    public static void main(String[] args) {
        String originalName = "交易结算通知书.docx";
        System.out.println(originalName.lastIndexOf(".")); // 7
        originalName = originalName.substring(0, originalName.lastIndexOf(".")) + ".pdf";
        System.out.println(originalName); // 交易结算通知书.pdf
    }
}
