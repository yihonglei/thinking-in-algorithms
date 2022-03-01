package com.jpeony.leetcode.n0104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 * [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)
 *
 * @author yihonglei
 */
public class N104_MaximumDepthOfBinaryTree {

    /**
     * 深度优先
     */
    public static int maxDepthDFS(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepthDFS(root.left);
            int rightHeight = maxDepthDFS(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    /**
     * 广度优先
     */
    public static int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root); // k 层，默认是根节点第一层

        int res = 0;
        while (!queue.isEmpty()) {
            // 循环 k 层，确定 k + 1 层
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            res++;
        }

        return res;
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

        int maxDepthDFS = maxDepthDFS(root);
        System.out.println("maxDepthDFS = " + maxDepthDFS);
    }
}
