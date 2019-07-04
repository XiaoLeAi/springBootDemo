package com.example.demo.test;

import com.example.demo.test.domain.Person;
import com.example.demo.test.domain.TestStatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther le
 * @date 2019/7/3 13:06
 */
public class staticTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                TestStatic testStatic = new TestStatic();
                Person person = new Person();
                System.out.println(Thread.currentThread().getName() + "--" + System.identityHashCode(person));
                testStatic.person = person;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--" + System.identityHashCode(testStatic.person));
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                TestStatic testStatic = new TestStatic();
                Person person = new Person();
                System.out.println(Thread.currentThread().getName() + "--" + System.identityHashCode(person));
                testStatic.person = person;
                System.out.println(Thread.currentThread().getName() + "--" + System.identityHashCode(testStatic.person));
            }
        };

        executorService.submit(task1);
        executorService.submit(task2);
    }
}
