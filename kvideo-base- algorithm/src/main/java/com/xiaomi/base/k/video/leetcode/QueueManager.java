package com.xiaomi.base.k.video.leetcode;


import com.xiaomi.base.k.video.model.TreeNode;

import java.util.*;

/**
 * @author lianglong jiang
 */
public class QueueManager {

    public static void main(String[] args) {
        //给定二叉树
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(4, new TreeNode(5, null, new TreeNode(9)), new TreeNode(6)));
        root.setRight(new TreeNode(2, new TreeNode(3), null));
//        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
//            add(root);
//        }};

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()){
            TreeNode poll = treeNodeQueue.poll();
            System.err.println(poll.val);
            if(poll.left != null) {
                treeNodeQueue.add(poll.left);
            }
            if(poll.right != null) {
                treeNodeQueue.add(poll.right);
            }
        }


        System.out.println(Arrays.toString(new int[0]));
    }
}
