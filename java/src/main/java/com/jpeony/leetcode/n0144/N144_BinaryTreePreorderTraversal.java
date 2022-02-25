package com.jpeony.leetcode.n0144;

import java.util.ArrayList;
import java.util.List;

/**
 * [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 * [144. 二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)
 *
 * @author yihonglei
 */
public class N144_BinaryTreePreorderTraversal {

    /**
     * 【递归】
     * 时间复杂度：O(n)。n 为二叉树节点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        inorder(root.left, result);
        inorder(root.right, result);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        root.right = node1;
        node1.left = node2;

        List<Integer> list = preorderTraversal(root);
        System.out.println("preorderTraversal = " + list.toString());
    }
}
