package com.xiaomi.base.k.video.leetcode;

/**
 * @author: jianglianglong
 * @Date: 2020/7/22 11:12
 */
public class ArrayRotation {

    public static int minArray(int[] numbers) {

        int flag = numbers[0];
        for (int number : numbers) {
            if (number < flag) {
                flag = number;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};
        int[] num1 = new int[]{2,2,2,0,1};
        System.out.println(minArray(num1));
    }

}
