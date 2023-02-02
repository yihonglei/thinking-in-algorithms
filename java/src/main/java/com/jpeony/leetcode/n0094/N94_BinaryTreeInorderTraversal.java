package com.jpeony.leetcode.n0094;

import java.util.*;

/**
 * [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
 * [94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/)
 *
 * @author yihonglei
 */
public class N94_BinaryTreeInorderTraversal {

    /**
     * 【递归】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    public static List<Integer> inorderTraversalRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        System.out.println("debug1 = " + root.val);
        result.add(root.val);
        inorder(root.right, result);
        System.out.println("debug2 = " + root.val);
    }

    public static List<Integer> inorderTraversalIterator(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
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
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

//        List<Integer> list = inorderTraversalRecursion(root);
//        System.out.println("inorderTraversal = " + list.toString());

        List<Integer> list = inorderTraversalIterator(root);
        System.out.println("inorderTraversalIterator = " + list.toString());
    }
}
