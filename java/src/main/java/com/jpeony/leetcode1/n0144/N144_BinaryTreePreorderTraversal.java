package com.jpeony.leetcode1.n0144;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 * [144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/)
 *
 * @author yihonglei
 */
public class N144_BinaryTreePreorderTraversal {

    /**
     * 【递归】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private static void preorder(TreeNode cur, List<Integer> result) {
        if (cur == null) {
            return;
        }
        result.add(cur.val);
        preorder(cur.left, result);
        System.out.println("debug1 = " + cur.val);
        preorder(cur.right, result);
        System.out.println("debug2 = " + cur.val);
    }

    /**
     * 【迭代】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    // 前序遍历顺序：中-左-右，入栈顺序：中-右-左
    public static List<Integer> preorderTraversalIterator(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
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
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        List<Integer> list = preorderTraversal(root);
        System.out.println("preorderTraversal = " + list.toString());
    }
}
