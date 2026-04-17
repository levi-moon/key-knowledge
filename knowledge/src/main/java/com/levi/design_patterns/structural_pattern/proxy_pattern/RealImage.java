package com.levi.design_patterns.structural_pattern.proxy_pattern;

/**
 * @Class: RealImage
 * @Description: 实像
 * @Author: Levi
 * @Date: 2026/2/15 15:35
 * @Version: 1.0
 */
public class RealImage implements Image {

    // 文件名称
    private String fileName;

    /**
     * 有参构造器
     *
     * @param fileName
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * 展示
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    /**
     * 从硬盘中加载
     *
     * @param fileName
     */
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
