package com.xiaomi.base.k.video.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: jianglianglong
 * @Date: 2020/7/22 10:07
 */
public class SumForTwo {

    public static int[] twoSum(int[] nums, int target) {
        int[] subScript = new int[2];
//        int m = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int flag = nums[i];
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    if (flag + nums[j] == target) {
//                        subScript[m]=i;
//                        subScript[m + 1] = j;
//                        return subScript;
//                    }
//                }
//            }
//        }
        int num = 0;
        int m = 0;
        for (int i = 0; i < nums.length; i++) {

            if (num == nums[i]) {
                subScript[0] = m;
                subScript[1] = i;
                return subScript;
            }
            m = i;
            num = target - nums[i];


        }
        return subScript;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] subScript = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                subScript[0] = i;
                subScript[1] = hash.get(nums[i]);
                return subScript;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return subScript;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {

            System.out.println(anInt);
        }
    }

}
