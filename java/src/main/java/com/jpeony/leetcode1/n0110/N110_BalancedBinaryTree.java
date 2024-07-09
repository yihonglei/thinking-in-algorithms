package com.jpeony.leetcode1.n0110;

/**
 * [110. 平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/)
 *
 * @author yihonglei
 */
public class N110_BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left); // 左

        int rightHeight = height(root.right); // 右

        if (leftHeight >= 0 && rightHeight >= 0 && Math.abs(leftHeight - rightHeight) <= 1) { // 中
            return Math.max(leftHeight, rightHeight) + 1; // 以当前节点为根节点的树的最大高度
        } else {
            return -1;
        }
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
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node2.left = node3;
        node2.right = node4;

        boolean b = isBalanced(root);
        System.out.println("isBalanced = " + b);
    }
}
