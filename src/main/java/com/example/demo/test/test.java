package com.example.demo.test;

import com.example.demo.thread.domian.LockTestDomain;
import com.example.demo.test.domain.Person;
import org.springframework.beans.BeanUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @auther le
 * @date 2019/6/28 17:38
 */
public class test {


    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(Math.sqrt(8));
        List<Person> list = buildPersonList();
        Map<String, List<Person>> collect = list.stream().collect(//list是需要去重的list，返回值是去重后的list
                Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getAge() + "_" + o.getName()))), ArrayList::new))
                .stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(collect);
    }

    private static int test() {
        int i = 0;
        try {
            i = 4;
        } finally {
            return i++;
        }
    }

    static List<Person> buildPersonList() {
        List<Person> list = new ArrayList<>();
        ;
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge("10");
        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge("21");
        Person p3 = new Person();
        p3.setName("李四");
        p3.setAge("10");
        Person p4 = new Person();
        p4.setName("王五");
        p4.setAge("21");
        Person p5 = new Person();
        p5.setName("王五");
        p5.setAge("21");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        return list;
    }

}
