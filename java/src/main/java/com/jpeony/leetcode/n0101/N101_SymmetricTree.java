package com.jpeony.leetcode.n0101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 * [101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree/)
 *
 * @author yihonglei
 */
public class N101_SymmetricTree {

    /**
     * 【迭代】
     * 时间复杂度：O(n)。每个点进队出队各一次。
     * 空间复杂度：O(n)。队列元素不超过 n 个。
     */
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();

            if (l == null && r == null) {
                continue;
            }

            if ((l == null || r == null) || (l.val != r.val)) {
                return false;
            }

            queue.offer(l.left);
            queue.offer(r.right);

            queue.offer(l.right);
            queue.offer(r.left);
        }

        return true;
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
        root.left = node2;

        boolean isSymmetric = isSymmetric(root);
        System.out.println("isSymmetric = " + isSymmetric);
    }
}
