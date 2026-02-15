package com.levi.knowledge.design_patterns.creational_pattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: Meal
 * @Description: 一餐
 * @Author: Levi
 * @Date: 2026/2/9 17:21
 * @Version: 1.0
 */
public class Meal {
    /**
     * 食物集合
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * 添加食物
     * @param item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * 计算费用
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 打印食物清单
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}

