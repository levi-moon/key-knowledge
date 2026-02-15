package com.levi.knowledge.design_patterns.structural_pattern.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: CriteriaSingle
 * @Description: 单身的标准
 * @Author: Levi
 * @Date: 2026/2/14 09:47
 * @Version: 1.0
 */
public class CriteriaSingle implements Criteria{
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
