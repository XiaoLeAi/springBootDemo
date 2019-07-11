package com.example.demo.solution;

import java.util.Random;

/**
 * @auther le
 * @date 2019/7/11 17:13
 */
public class RedEnvelopes {


    /**
     * 给定一个红包总额，分配的人数，每个人最多和最少分配的钱数，
     *
     * @param args
     */
    public static void main(String[] args) {
        redEnvelopes(100,10,13,7);
    }

    public static void redEnvelopes(int money , int people,int max,int min) {
        int[] red = new int[people];
        for (int j = 0; j < people; j++) {
            red[j] = min;
        }
        for (int i = 0; i < (money-people*min); i++) {
            int index = getIndex(red,people,max);
            red[index] += 1;
        }
        System.out.println(red);
    }

    private static int getIndex(int[] red,int people,int max) {
        Random random = new Random();
        int index = random.nextInt(people);
        if (red[index] < max){
            return index;
        }
        return getIndex(red,people,max);
    }


}
