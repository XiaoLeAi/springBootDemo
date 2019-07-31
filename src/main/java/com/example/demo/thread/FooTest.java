package com.example.demo.thread;

/**
 * @auther le
 * @date 2019/7/19 11:12
 */
public class FooTest {

    public void foo() {
        System.out.print("foo");
    }

    public void bar() {
        System.out.print("bar");
    }


    public static void main(String[] args) {
        FooTest fooTest = new FooTest();
        FooBar fooBar = new FooBar(10);
        Runnable foo = new Runnable() {
            @Override
            public void run() {
                fooTest.foo();
            }
        };
        Runnable bar = new Runnable() {
            @Override
            public void run() {
                fooTest.bar();
            }
        };
        try {
            fooBar.foo(foo);
            fooBar.bar(bar);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
