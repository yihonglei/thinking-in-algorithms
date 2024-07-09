package com.jpeony.leetcode1.n0230;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [230. 二叉搜索树中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/)
 *
 * @author yihonglei
 */
public class N230_KthSmallestElementInABst {

    // 栈方式
    public static int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }

    /**
     * // dfs
     * int count = 1; // 计数
     * int result = 0; // 返回结果
     * public int kthSmallest(TreeNode root, int k) {
     * dfs(root, k);
     * return result;
     * }
     * <p>
     * public void dfs(TreeNode root, int k) {
     * if (root == null) {
     * return;
     * }
     * dfs(root.left, k);
     * if (count == k) {
     * result = root.val;
     * }
     * count++;
     * dfs(root.right, k);
     * }
     */

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
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);

        root.left = node1;
        root.right = node2;

        node1.left = null;
        node1.right = node3;

        int k = 1;
        int res = kthSmallest(root, k);
        System.out.println("kthSmallest = " + res);
    }
}
