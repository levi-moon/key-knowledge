package com.levi.design_patterns.creational_pattern.prototype_pattern;

/**
 * @Class: Shape
 * @Description: 形状抽象类，实现了Cloneable接口
 * @Author: Levi
 * @Date: 2026/2/10 10:07
 * @Version: 1.0
 */
public abstract class Shape implements Cloneable {

    // 形状唯一标识
    private String id;

    // 形状类型
    protected String type;

    /**
     * 画
     */
    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 克隆
     * @return
     */
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
