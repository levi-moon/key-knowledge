package com.levi.knowledge.design_patterns.structural_pattern.filter_pattern;

import java.util.List;

/**
 * @Class: Criteria
 * @Description: 标准接口
 * @Author: Levi
 * @Date: 2026/2/14 09:44
 * @Version: 1.0
 */
public interface Criteria {

    /**
     * 符合标准
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
