package com.example.demo.thread;

import com.example.demo.thread.domian.LockTestDomain;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther le
 * @date 2019/7/17 14:52
 */
public class LockTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                LockTestDomain lockTestDomain = new LockTestDomain();
                lockTestDomain.setIqp("iqp123");
                SynTest synTest = new SynTest();
                synTest.test(lockTestDomain.iqp);
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                LockTestDomain lockTestDomain = new LockTestDomain();
                lockTestDomain.setIqp(new String("iqp123").toString());
                SynTest synTest = new SynTest();
                synTest.test(lockTestDomain.iqp);
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
    }
}
