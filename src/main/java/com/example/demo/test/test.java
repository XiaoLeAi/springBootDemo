package com.example.demo.test;

import com.example.demo.thread.domian.LockTestDomain;
import com.example.demo.test.domain.Person;
import org.springframework.beans.BeanUtils;

/**
 * @auther le
 * @date 2019/6/28 17:38
 */
public class test {

    public static void main(String[] args) {
        LockTestDomain lock = new LockTestDomain();
        LockTestDomain lock1 = new LockTestDomain();
        lock.setIqp("iqp1");
        lock1.setIqp("iqp1");
        String iqp1 = new String("iqp1");
        System.out.println(lock1.iqp==lock1.iqp);
    }

    public static void setValue(Person person) {
        Person person1 = new Person();
        person1.setName("李四");
        person1.setBrithday("2019-08-08");
        BeanUtils.copyProperties(person1,person);
    }
}
