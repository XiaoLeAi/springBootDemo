package com.example.demo.exception;

import org.apache.poi.ss.formula.functions.T;

/**
 * @auther le
 * @date 2019/7/5 17:47
 */
public class test1 {

    public static <T> T test(T t) {
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
           throw new RuntimeException();
        }
        return t;
    }
}
