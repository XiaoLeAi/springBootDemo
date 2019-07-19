package com.example.demo.solution;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @auther le
 * @date 2019/7/17 11:19
 */
public class SingleNumber {

    public static void main(String[] args) {
        //int[] ints = new int[]{1,2,3,1,2,3,4};
       int[] ints = new int[]{-19,-46,-19,-46,-9,-9,-19,17,17,17,-13,-13,-9,-13,-46,-28};
        //int[] ints = new int[]{0,1,0,1,0,1,99};
        int num = getNum(ints);
        System.out.println(num);
    }

    private static int getNum(int[] nums) {
        if (nums.length==1) return nums[0];
        Arrays.sort(nums);
        int tmp = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i] != nums[i+1])&& i==0){
                tmp = nums[i];
                break;
            }
            if ((nums[i] != nums[i+1])&& (nums[i+1] != nums[i+2])){
                tmp = nums[i+1];
                break;
            };
            if ((nums[i] == nums[i+1])&& i==nums.length-3){
                tmp = nums[i+2];
                break;
            };
        }
        return tmp;
    }
}
