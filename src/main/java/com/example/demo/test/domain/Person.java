package com.example.demo.test.domain;

import com.example.demo.annotation.NameScanner;

import java.util.List;
import java.util.Map;

/**
 * @auther le
 * @date 2019/2/19 15:51
 */

public class Person {

    @NameScanner
    private String name;
    private String age;
    private String salary;
    private String depaetment;
    private String brithday;
    private String score;
    private List<Person> maps;

    public Person() {
        this.name = "张三";
    }

    public List<Person> getMaps() {
        return maps;
    }

    public void setMaps(List<Person> maps) {
        this.maps = maps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepaetment() {
        return depaetment;
    }

    public void setDepaetment(String depaetment) {
        this.depaetment = depaetment;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", depaetment='" + depaetment + '\'' +
                ", brithday='" + brithday + '\'' +
                ", score='" + score + '\'' +
                ", maps=" + maps +
                '}';
    }
}
