package com.jpeony.leetcode.n0112;

/**
 * [112. Path Sum](https://leetcode.com/problems/path-sum/)
 * [112. 路径总和](https://leetcode-cn.com/problems/path-sum/)
 *
 * @author yihonglei
 */
public class N112_PathSum {


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasPathSumDFS(root, targetSum);
    }

    /**
     * 深度优先
     */
    public static boolean hasPathSumDFS(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            return (sum - root.val) == 0;
        }

        if (root.left != null && hasPathSumDFS(root.left, sum - root.val)) {
            return true;
        }

        if (root.right != null && hasPathSumDFS(root.right, sum - root.val)) {
            return true;
        }

        return false;
    }

    /**
     * 递归法
     */
    public static boolean hasPathSumRecursion(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSumRecursion(root.left, targetSum - root.val) || hasPathSumRecursion(root.right, targetSum - root.val);
    }

    /**
     * 广度优先
     */
    public static boolean hasPathSumBFS(TreeNode root, int targetSum) {

        return false;
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

        int targetSum = 5;

        boolean hasPathSum = hasPathSum(root, targetSum);
        System.out.println("hasPathSum = " + hasPathSum);
    }
}
