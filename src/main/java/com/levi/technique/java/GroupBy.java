package com.levi.technique.java;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 用Java实现sql的group by函数
 *
 * @author Levi
 * @since 2024/5/14 9:35:12
 */
@Slf4j
public class GroupBy {

    public static void main(String[] args) {
        GroupBy groupBy = new GroupBy();
        List<Map> list = groupBy.useGroupBy(groupBy.createList());
        log.info("最终集合：{}", list);
    }

    /**
     * 创建集合数据
     *
     * @return list List
     */
    public List<Map> createList() {
        List<Map> list = new ArrayList<Map>();
        // 第一个对象
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("system", "01");
        map1.put("ywlsh", "123qweasdzxc");
        map1.put("xh", "1qaz");
        map1.put("dlDm", "A1");
        map1.put("zlDm", "A1A1");
        map1.put("xlDm", "A1A1A1");
        map1.put("ywsj", "测试1");
        list.add(map1);
        // 第二个对象
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("system", "01");
        map2.put("ywlsh", "123qweasdzxc");
        map2.put("xh", "2wsx");
        map2.put("dlDm", "A1");
        map2.put("zlDm", "A1A1");
        map2.put("xlDm", "A1A1A1");
        map2.put("ywsj", "测试2");
        list.add(map2);
        // 第三个对象
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("system", "02");
        map3.put("ywlsh", "234wersdfxcv");
        map3.put("xh", "3edc");
        map3.put("dlDm", "A1");
        map3.put("zlDm", "A1B1");
        map3.put("xlDm", "A1B1A1");
        map3.put("ywsj", "测试3");
        list.add(map3);
        // 第四个对象
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("system", "02");
        map4.put("ywlsh", "234wersdfxcv");
        map4.put("xh", "3edc");
        map4.put("dlDm", "A1");
        map4.put("zlDm", "A1B1");
        map4.put("xlDm", "A1B1C1");
        map4.put("ywsj", "测试4");
        list.add(map4);

        return list;
    }

    /**
     * 使用group by
     *
     * @param list 入参
     * @return list List
     */
    public List<Map> useGroupBy(List<Map> list) {
        List<Map> resultList = new ArrayList<Map>();
        /*
        1. 先根据system、ywlsh、xh进行分组；
        2. 再根据dlDm、zlDm、xlDm进行分组；
        3. 组合成新的list集合；
        4. list集合组织形式：
        father:[
            {
                system:'',
                ywlsh:'',
                xh:'',
                son:[
                    {
                        dlDm:'',
                        zlDm:'',
                        xlDm:'',
                        grantSon:[
                            {
                                system,
                                ywlsh,
                                xh,
                                dlDm,
                                zlDm,
                                xlDm,
                                ywsj,
                            }
                        ]
                    }
                ]
            }
        ]
         */
        // 1. 先根据system、ywlsh、xh进行分组；
        Map<String,List<Map>> level1 = list.stream().collect(Collectors.groupingBy(m -> m.get("system") + "+" + m.get("ywlsh") + "+" + m.get("xh")));
        if(level1 == null || level1.isEmpty()){
            return resultList;
        }
        log.info("根据system、ywlsh、xh进行分组，产生的结果：{}", level1);
        // 2. 获取第一步获取的map的key值集合
        Set<String> keyLevel1 = level1.keySet();
        log.info("第一步获取的map的key值集合：{}", keyLevel1);
        List<Map> list1 = new ArrayList<>();
        for(String value: keyLevel1){
            List<Map> temp = level1.get(value);
            if(temp == null || temp.isEmpty()){
                continue;
            }
            Map<String, Object> map1 = new HashMap<>();
            map1.put("system", temp.get(0).get("system"));
            map1.put("ywlsh", temp.get(0).get("ywlsh"));
            map1.put("xh", temp.get(0).get("xh"));
            map1.put("son", temp);
            list1.add(map1);
        }
        if(list1 == null || list1.isEmpty()){
            return resultList;
        }
        log.info("第一层group by后，组织成的数据集合：{}", list1);
        // 3. 根据第一层的数据集，处理第二层的数据集
        for(Map m: list1){
            List<Map> temp = (List<Map>) m.get("son");
            if(temp == null || temp.isEmpty()){
                continue;
            }
            Map<String, List<Map>> level2 = temp.stream().collect(Collectors.groupingBy(o -> o.get("dlDm") + "+" + o.get("zlDm") + "+" + o.get("xlDm")));
            if(level2 == null || level2.isEmpty()){
                continue;
            }
            Set<String> keyLevel2 = level2.keySet();
            log.info("第二步获取的map的key值集合：{}", keyLevel2);
            List<Map> list2 = new ArrayList<>();
            for(String value: keyLevel2){
                List<Map> temp1 = level2.get(value);
                if(temp1 == null || temp1.isEmpty()){
                    continue;
                }
                Map<String, Object> map2 = new HashMap<>();
                map2.put("dlDm", temp1.get(0).get("dlDm"));
                map2.put("zlDm", temp1.get(0).get("zlDm"));
                map2.put("xlDm", temp1.get(0).get("xlDm"));
                map2.put("grantSon", temp1);
                list2.add(map2);
            }
            m.put("son",list2);
        }
        log.info("第二层group by后，组织成的数据集合：{}", list1);
        Map<String, Object> map = new HashMap<>();
        map.put("father", list1);
        resultList.add(map);
        return resultList;
    }
}
