package com.example.demo.test.domain;

/**
 * @auther le
 * @date 2019/7/3 13:05
 */
public class TestStatic {


    public volatile Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
