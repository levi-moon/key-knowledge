package com.levi.design_patterns.structural_pattern.filter_pattern;

import java.util.List;

/**
 * @Class: OrCriteria
 * @Description: 至少符合一项标准
 * @Author: Levi
 * @Date: 2026/2/14 09:49
 * @Version: 1.0
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
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
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
