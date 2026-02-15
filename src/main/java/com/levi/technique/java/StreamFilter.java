package com.levi.technique.java;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream函数的filter方法
 *
 * @ClassName: StreamFilter
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/7/31 16:06
 */
@Slf4j
public class StreamFilter {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter 和 Setter 方法
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20),
                new Person("Bob", 17),
                new Person("Charlie", 22)
        );
        Person person = people.stream().filter(e -> "Bob".equals(e.getName())).collect(Collectors.toList()).get(0);
        log.info("person的值：{}", JSONUtil.toJsonStr(person)); // person的值：{"name":"Bob","age":17}
    }

}

