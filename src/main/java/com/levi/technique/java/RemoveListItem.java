package com.levi.technique.java;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 删除list集合中的元素
 *
 */
@Slf4j
public class RemoveListItem {

    /**
     * 迭代器的方式删除集合元素
     *
     * @param list
     * @param target
     * @return
     */
    public static List<String> iteratorRemoveList(List<String> list, String target) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (target.equals(element)) {
                iterator.remove();
            }
        }
        return list;
    }

    /**
     * 倒for循环的方式删除集合元素
     *
     * @param list
     * @param target
     * @return
     */
    public static List<String> forRemoveList(List<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            String element = list.get(i);
            if (target.equals(element)) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * stream方式删除集合元素
     *
     * @param list
     * @param target
     * @return
     */
    public static List<String> streamRemoveList(List<String> list, String target) {
        list = list.stream()
                .filter(element -> !Objects.equals(element, target))
                .collect(Collectors.toList());
        return list;
    }

    /**
     * list的removeIf方式删除集合元素
     *
     * @param list
     * @param target
     * @return
     */
    public static List<String> removeIfRemoveList(List<String> list, String target) {
        list.removeIf(element -> Objects.equals(element, target));
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("q");
        list.add("a");
        list.add("z");
//        List<String> result = iteratorRemoveList(list, "a");
//        List<String> result = forRemoveList(list, "a");
//        List<String> result = streamRemoveList(list, "a");
        List<String> result = removeIfRemoveList(list, "a");
        log.info("{}", result); // [1, q, z]
    }
}
