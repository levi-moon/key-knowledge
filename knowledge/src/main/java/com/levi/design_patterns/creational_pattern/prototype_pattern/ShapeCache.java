package com.levi.design_patterns.creational_pattern.prototype_pattern;

import java.util.Hashtable;

/**
 * @Class: ShapeCache
 * @Description: 存储具体形状的形状缓存
 * @Author: Levi
 * @Date: 2026/2/10 10:23
 * @Version: 1.0
 */
public class ShapeCache {
    // 存储形状实体类的表格
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    /**
     * 获取形状
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
