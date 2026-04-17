package com.levi.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: BuilderPatternDemo
 * @Description: TODO
 * @Author: Levi
 * @Date: 2026/2/9 17:25
 * @Version: 1.0
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        // 新建一餐建造者（生成店员）
        MealBuilder mealBuilder = new MealBuilder();

        // 生成素的一餐
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        System.out.println();
        System.out.println("=================");
        System.out.println();

        // 生成非素的一餐
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
