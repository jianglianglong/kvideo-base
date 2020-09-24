package com.xiaomi.base.k.video.leetcode;

import com.xiaomi.base.k.video.model.TreeNode;
import sun.reflect.generics.tree.Tree;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 *
 * @author jianglianglong
 * @date 2020/9/21 10:20
 */
public class GreaterTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2, new TreeNode(3), null));

        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);

    }


    public static int sum = 0;
    public static List<Integer> treeList = new ArrayList<>();

    /**
     * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
     *
     * @param root
     * @return
     */
    public static TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    /**
     * 给定一个二叉树，返回它的中序 遍历。
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root != null) {
            inorderTraversal(root.left);
            treeList.add(root.val);
            inorderTraversal(root.right);
        }

        return treeList;
    }
}
