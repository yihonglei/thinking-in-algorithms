package com.jpeony.leetcode1.n0404;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [404. Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/)
 * [404. 左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/)
 *
 * @author yihonglei
 */
public class N404_SumOfLeftLeaves {

    /**
     * 深度优先
     */
    public static int sumOfLeftLeavesDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftValue = sumOfLeftLeavesDFS(root.left); // 左

        int rightValue = sumOfLeftLeavesDFS(root.right); // 右

        int middleValue = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) { // 中
            middleValue += root.left.val;
        }

        int sum = middleValue + leftValue + rightValue;

        return sum;
    }

    /**
     * 广度优先-纯迭代法
     */
    public static int sumOfLeftLeavesBFSIn(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        // 纯的迭代法
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) { // 判断符合条件的左叶子节点，注意不是求所有左节点的和
                    sum += node.left.val;
                } else {
                    queue.offer(node.left);
                }
            }

            if (node.right != null) {
                if (node.right.left != null || node.right.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return sum;
    }

    /**
     * 广度优先-层序遍历迭代法
     */
    public static int sumOfLeftLeavesBFSLevel(TreeNode root) {
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
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        int sum = sumOfLeftLeavesDFS(root);
        System.out.println("sumOfLeftLeaves = " + sum);
    }
}
