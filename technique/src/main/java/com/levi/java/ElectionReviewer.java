package com.levi.java;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 选举策略的实现
 *
 * @ClassName: ElectionReviewer
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/9/12 18:43
 */
@Slf4j
public class ElectionReviewer {

    public static void main(String[] args) {
        List<String> candidate = new ArrayList<>();
        candidate.add("Tom");
        candidate.add("Sum");
        candidate.add("Jerry");
        candidate.add("Tom");
        candidate.add("Jerry");

        Map<String,Long> nameMap = candidate.stream().collect(Collectors.groupingBy(o->o,Collectors.counting()));
        log.info("候选人选票情况：{}", nameMap); // 候选人选票情况：{Tom=2, Sum=1, Jerry=2}
        // 筛选出选票最多的人
        String maxKey = null;
        Long maxValue = null;
        for(Map.Entry<String,Long> entry:nameMap.entrySet()){
            if(maxValue == null || entry.getValue().compareTo(maxValue) > 0){
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        if(maxKey != null){
            log.info("获胜人是：{}，获得{}张选票",maxKey,maxValue); // 获胜人是：Tom，获得2张选票
        }
    }
}
