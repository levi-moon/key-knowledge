package com.levi.design_patterns.structural_pattern.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: CriteriaMale
 * @Description: 男性的标准
 * @Author: Levi
 * @Date: 2026/2/14 09:44
 * @Version: 1.0
 */
public class CriteriaMale implements Criteria{
    /**
     * 符合标准
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
