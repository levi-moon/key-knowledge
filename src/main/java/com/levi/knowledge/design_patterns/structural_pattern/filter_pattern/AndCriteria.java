package com.levi.knowledge.design_patterns.structural_pattern.filter_pattern;

import java.util.List;

/**
 * @Class: AndCriteria
 * @Description: 同时符合两项标准
 * @Author: Levi
 * @Date: 2026/2/14 09:48
 * @Version: 1.0
 */
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
