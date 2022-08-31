package com.jpeony.leetcode.n0111;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
 * [111. 二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/)
 *
 * @author yihonglei
 */
public class N111_MinimumDepthOfBinaryTree {

    /**
     * 深度优先
     */
    public static int minDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int minDepth = Integer.MAX_VALUE;
        if (root.left != null) {
            minDepth = Math.min(minDepthDFS(root.left), minDepth);
        }

        if (root.right != null) {
            minDepth = Math.min(minDepthDFS(root.right), minDepth);
        }

        return minDepth + 1;
    }

    /**
     * 广度优先
     */
    public static int minDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int minDepth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    minDepth++;
                    return minDepth;
                } else {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }

            minDepth++;
        }

        return minDepth;
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

        int minDepthDFS = minDepthDFS(root);
        System.out.println("minDepthDFS = " + minDepthDFS);
    }
}
