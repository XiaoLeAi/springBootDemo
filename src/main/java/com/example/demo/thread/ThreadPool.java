package com.example.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther le
 * @date 2019/4/28 16:28
 */
public class ThreadPool {

    public void threadPool(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {

            }
        };
        executorService.submit(task1);
        executorService.submit(task2);

    }
}
