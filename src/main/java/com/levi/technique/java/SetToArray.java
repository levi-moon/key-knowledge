package com.levi.technique.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 试验set转数组
 *
 * @ClassName: SetToArray
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/9/15 17:46
 */
public class SetToArray {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        String[] array = set.toArray(new String[0]); // 注意：这里使用new String[0]是为了确保正确的类型推断
        System.out.println(array[0]); // Apple
        System.out.println(Arrays.toString(array)); // [Apple, Cherry, Banana]
    }
}
