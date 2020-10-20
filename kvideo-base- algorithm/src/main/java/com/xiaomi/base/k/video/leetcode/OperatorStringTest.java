package com.xiaomi.base.k.video.leetcode;

import org.junit.Test;

/**
 * @author lianglong jiang
 * @date 2020/10/19 3:17 下午
 */
public class OperatorStringTest {


    @Test
    public void pushFrame() {
        String l = "y#fo##f";
        String l2 = "y#f#o##f";
        String build = build(l2);
        System.out.println(build);
        boolean equals = build.equals(build(l2));
        System.out.println(equals);
    }

    private String build(String oldStr) {
        StringBuilder newStr = new StringBuilder();
        int length = oldStr.length();
        for (int i = 0; i < length; i++) {
            char c = oldStr.charAt(i);
            if (c == '#' && newStr.length() > 0) {
                newStr.deleteCharAt(newStr.length() - 1);
            } else if (c != '#'){
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}
