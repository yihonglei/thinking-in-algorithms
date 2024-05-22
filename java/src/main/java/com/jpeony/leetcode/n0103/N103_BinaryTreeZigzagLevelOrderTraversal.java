package com.jpeony.leetcode.n0103;

import java.util.*;

/**
 * [103. 二叉树的锯齿形层序遍历](https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal)
 */
public class N103_BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        boolean isOrderLeft = true;// 记录当前层遍历顺序，从左往右为true，从右往左为false
        Queue<TreeNode> queue = new LinkedList<>(); // 记录单层元素
        queue.offer(root);// 第一层
        while (!queue.isEmpty()) {
            Deque<Integer> curList = new LinkedList<Integer>();
            int curLen = queue.size();
            for (int i = 1; i <= curLen; i++) {
                TreeNode curNode = queue.poll();
                if (isOrderLeft) {
                    curList.offerLast(curNode.val);
                } else {
                    curList.offerFirst(curNode.val);
                }

                // 下一层
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            isOrderLeft = !isOrderLeft;
            result.add(new LinkedList<Integer>(curList));
        }

        return result;
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

        List<List<Integer>> list = zigzagLevelOrder(root);
        System.out.println("levelOrder = " + list.toString());
    }
}
