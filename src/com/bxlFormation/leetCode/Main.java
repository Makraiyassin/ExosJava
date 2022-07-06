package com.bxlFormation.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;
//        Arrays.stream(twoSum(nums,target)).forEach(System.out::println);

        String[] strs = new String[]{"darci","dog","doracecar","docar"};
        System.out.println("end: "+longestCommonPrefix(strs));
    }

    public static  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if((nums[i]+nums[j] == target) && i != j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }

    public static String longestCommonPrefix(String[] strs) {
        String tmp = strs[0];
        for (String str : strs) {
            while (str.indexOf(tmp) != 0) {
                tmp = tmp.substring(0, tmp.length() - 1);
            }
        }
        return tmp;
    }
}
