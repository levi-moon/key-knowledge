package com.levi.knowledge.design_patterns.structural_pattern.proxy_pattern;

/**
 * @Class: ProxyImage
 * @Description: 代理镜像
 * @Author: Levi
 * @Date: 2026/2/15 15:38
 * @Version: 1.0
 */
public class ProxyImage implements Image {

    // 真实的图像
    private RealImage realImage;
    // 文件名称
    private String fileName;

    /**
     * 有参构造器
     *
     * @param fileName
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 展示
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
