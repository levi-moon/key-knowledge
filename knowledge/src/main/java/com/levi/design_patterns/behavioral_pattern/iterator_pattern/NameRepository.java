package com.levi.design_patterns.behavioral_pattern.iterator_pattern;

/**
 * @Class: NameRepository
 * @Description: 名称仓库
 * @Author: Levi
 * @Date: 2026/2/17 20:35
 * @Version: 1.0
 */
public class NameRepository implements Container {

    // 名称集合
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    /**
     * 获取迭代器
     *
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
