package com.example.demo.solution;

import org.junit.Test;



/**
 * @auther le
 * @date 2019/7/12 15:34
 */
public class test {


    public static void main(String[] args) {

        int[] i = new int[]{0,0,0,1,1,2,3,4,4,5,6,7,7};
        removeDuplicates(i);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
