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

    private static void inorder(TreeNode cur, List<Integer> result) {
        if (cur == null) {
            return;
        }
        inorder(cur.left, result);
        System.out.println("debug1 = " + cur.val);
        result.add(cur.val);
        inorder(cur.right, result);
        System.out.println("debug2 = " + cur.val);
    }

    /**
     * 【迭代】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    // 中序遍历顺序: 左-中-右 入栈顺序： 左-右
    public static List<Integer> inorderTraversalIterator(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur.left);
                cur = cur.left;
            }

            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
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

//        List<Integer> list = inorderTraversalRecursion(root);
//        System.out.println("inorderTraversal = " + list.toString());

        List<Integer> list = inorderTraversalIterator(root);
        System.out.println("inorderTraversalIterator = " + list.toString());
    }
}
