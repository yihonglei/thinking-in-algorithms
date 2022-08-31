package com.jpeony.leetcode.n0404;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)
 * [404. 左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/)
 *
 * @author yihonglei
 */
public class N404_SumOfLeftLeaves {
    static int sum = 0;

    /**
     * 深度优先
     */
    public static int sumOfLeftLeavesDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sumOfLeftLeavesDFS(root.left);
        sumOfLeftLeavesDFS(root.right);

        return sum;
    }

    /**
     * 广度优先
     */
    public static int sumOfLeftLeavesBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int levelCurrentSize = queue.size();
            for (int i = 1; i <= levelCurrentSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null && node.left.left == null && node.left.right == null) {
                    ans += node.left.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return ans;
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

        int sum = sumOfLeftLeavesDFS(root);
        System.out.println("sumOfLeftLeaves = " + sum);
    }
}
