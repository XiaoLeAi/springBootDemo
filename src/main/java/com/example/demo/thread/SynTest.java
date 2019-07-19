package com.example.demo.thread;

/**
 * @auther le
 * @date 2019/7/17 15:19
 */
public class SynTest {

    public static void test(String s) {
        synchronized (s) {

            System.out.println("[" + Thread.currentThread().getName() + "]开始运行了");
            // 休眠5秒模拟脚本调用
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + Thread.currentThread().getName() + "]结束运行了");
        }
    }
}
