package com.levi.knowledge.design_patterns.behavioral_pattern.memento_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: CareTaker
 * @Description: 负责人
 * @Author: Levi
 * @Date: 2026/2/17 21:01
 * @Version: 1.0
 */
public class CareTaker {

    // 备忘录列表
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * 添加备忘录
     *
     * @param state
     */
    public void add(Memento state) {
        mementoList.add(state);
    }

    /**
     * 根据索引获取备忘录
     *
     * @param index
     * @return
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
