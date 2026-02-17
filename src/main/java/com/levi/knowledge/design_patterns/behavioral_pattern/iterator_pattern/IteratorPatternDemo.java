package com.levi.knowledge.design_patterns.behavioral_pattern.iterator_pattern;

/**
 * @Class: IteratorPatternDemo
 * @Description: 迭代器模式
 * @Author: Levi
 * @Date: 2026/2/17 20:37
 * @Version: 1.0
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
