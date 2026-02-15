package com.levi.knowledge.design_patterns.creational_pattern.builder_pattern;

/**
 * @Class: MealBuilder
 * @Description: 一餐建造者（快餐店店员）
 * @Author: Levi
 * @Date: 2026/2/9 17:22
 * @Version: 1.0
 */
public class MealBuilder {

    /**
     * 准备素餐
     * @return
     */
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 准备非素餐
     * @return
     */
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
