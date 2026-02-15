package com.levi.technique.java;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用递归的方法，生成树
 *
 *              a
 *          a1      a2
 *      a1a1
 * a1a1a1
 *
 * @author Levi
 * @since 2024/5/14 9:35:12
 */
@Slf4j
public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        List<Map> list = recursion.getData("a");
        System.out.println(list);
        // 打印出的结果：
        /*[{
            data = a,
            children =[
                {
                    data = a1,
                    children =[
                        {
                            data = a1a1,
                            children =[
                                {
                                    data = a1a1a1,
                                    pid = a1a1,
                                    id = a1a1a1
                                }
                            ],
                            pid = a1,
                            id = a1a1
                        }
                    ],
                    pid = a,
                    id = a1
                },
                {
                    data = a2,
                    pid = a,
                    id = a2
                }
            ],
            pid =,
            id = a
        }]*/
    }

    /**
     * 创建集合数据
     *
     * @return list List
     */
    public List<Map> createList() {
        List<Map> list = new ArrayList<Map>();

        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("pid", "");
        map1.put("id", "a");
        map1.put("data", "a");
        list.add(map1);

        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("pid", "a");
        map2.put("id", "a1");
        map2.put("data", "a1");
        list.add(map2);

        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("pid", "a");
        map3.put("id", "a2");
        map3.put("data", "a2");
        list.add(map3);

        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("pid", "a1");
        map4.put("id", "a1a1");
        map4.put("data", "a1a1");
        list.add(map4);

        Map<String, Object> map5 = new HashMap<String, Object>();
        map5.put("pid", "a1a1");
        map5.put("id", "a1a1a1");
        map5.put("data", "a1a1a1");
        list.add(map5);

        log.info("创建的list集合的值为：{}", list);
        return list;
    }

    /**
     * 获取组装后的数据
     *
     * @param rootId 根节点的id
     * @return list List
     */
    public List<Map> getData(String rootId){
        List<Map> list = createList();
        List<Map> allList = Lists.newArrayList();
        for(Map map: list){
            if(map.get("id").equals(rootId)){
                allList.add(map);
            }
        }
        recursionList(allList,list);
        return allList;
    }

    /**
     * 递归处理数据
     * @param newList
     * @param oldList
     */
    public void recursionList(List<Map> newList,List<Map> oldList){
        for(Map newMap: newList){
            List<Map> childList = Lists.newArrayList();
            for(Map oldMap: oldList){
                if(oldMap.get("pid").equals(newMap.get("id"))){
                    childList.add(oldMap);
                }
            }
            if(!childList.isEmpty()){
                newMap.put("children",childList);
                recursionList(childList,oldList);
            }
        }
    }

}
