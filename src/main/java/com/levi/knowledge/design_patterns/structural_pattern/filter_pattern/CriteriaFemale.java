package com.levi.knowledge.design_patterns.structural_pattern.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: CriteriaFemale
 * @Description: 女性的标准
 * @Author: Levi
 * @Date: 2026/2/14 09:46
 * @Version: 1.0
 */
public class CriteriaFemale implements Criteria{
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
