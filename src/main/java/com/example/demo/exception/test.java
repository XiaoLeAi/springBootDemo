package com.example.demo.exception;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.example.demo.test.domain.Person;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther le
 * @date 2019/7/5 17:47
 */
public class test {

    public static void main(String[] args) {


        //m1();
        m2();
    }

    private static void m1() {
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setAge("123");
        person.setBrithday("123");
        person.setName("张三");
        Person person1 = new Person();
        person1.setAge("456");
        person1.setBrithday("456");
        person1.setName("李四");
        list.add(person1);
        list.add(person);
        Object o = list;
        String string = JSON.toJSONString(o);
        Object parse = JSON.parse(string);
        System.out.println(parse);
    }
    private static void m2() {
        List<Person> list = new ArrayList<>();
        List<Person> list1 = new ArrayList<>();
        Person person = new Person();
        person.setAge("123");
        person.setBrithday("123");
        person.setName("张三");
        Person person2 = new Person();
        person.setAge("123");
        person.setBrithday("123");
        person.setName("wangwu");
        list.add(person);
        list1.add(person2);
        Person person1 = new Person();
        person1.setAge("456");
        person1.setBrithday("456");
        person1.setName("李四");
        person1.setMaps(list1);
        list.add(person1);

        Object o = list;
        Class<?> aClass = o.getClass();
        String string = JSON.toJSONString(o);
        Object parse = JSON.parseArray(string, Person.class);
        System.out.println(parse);
    }


}
