package com.jpeony.leetcode.n0530;

import java.util.ArrayList;
import java.util.List;

/**
 * [530. Minimum Absolute Difference in BST](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)
 * [530. 二叉搜索树的最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference-in-bst/)
 *
 * @author yihonglei
 */
public class N530_MinimumAbsoluteDifferenceInBST {

    static int ans = Integer.MAX_VALUE;
    static int pre = -1;

    public static int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }

    private static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
      // 中序遍历
//    public static int getMinimumDifference(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        List<Integer> result = new ArrayList<>();
//        dfs(root, result);
//
//        int minValue = Integer.MAX_VALUE;
//        for (int i = 1; i < result.size(); i++) {
//            int sub = result.get(i)  - result.get(i - 1);
//            minValue = Math.min(minValue, sub);
//        }
//
//        return minValue;
//    }
//
//    public static void dfs(TreeNode cur, List result) {
//        if (cur == null) {
//            return;
//        }
//        dfs(cur.left, result);
//        result.add(cur.val);
//        dfs(cur.right, result);
//    }

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
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        int i = getMinimumDifference(root);
        System.out.println("getMinimumDifference = " + i);
    }
}
