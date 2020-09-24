package com.xiaomi.base.k.video.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jianglianglong
 * @date 2020/9/21 10:18
 */
@Data
@AllArgsConstructor
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}
