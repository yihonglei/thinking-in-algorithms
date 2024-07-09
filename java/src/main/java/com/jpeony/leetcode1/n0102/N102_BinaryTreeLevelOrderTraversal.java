package com.jpeony.leetcode1.n0102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 * [102. 二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/)
 *
 * @author yihonglei
 */
public class N102_BinaryTreeLevelOrderTraversal {

    /**
     * 【递归】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>(); // 记录 某层元素
        queue.offer(root); // 第一层
        while (!queue.isEmpty()) {
            List<Integer> curLevelList = new ArrayList<>(); // 收集当前层结果
            int curQueueSize = queue.size();
            for (int i = 1; i <= curQueueSize; i++) {
                // 循环当前层
                TreeNode node = queue.poll();
                curLevelList.add(node.val);
                // 计算下一层
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            res.add(curLevelList);
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
        root.left = node2;

        List<List<Integer>> list = levelOrder(root);
        System.out.println("levelOrder = " + list.toString());
    }
}
