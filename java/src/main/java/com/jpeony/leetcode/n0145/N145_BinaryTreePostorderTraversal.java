package com.jpeony.leetcode.n0145;

import java.util.*;

/**
 * [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
 * [145. 二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/)
 *
 * @author yihonglei
 */
public class N145_BinaryTreePostorderTraversal {

    /**
     * 【递归】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        System.out.println("debug1 = " + root.val);
        postorder(root.right, result);
        System.out.println("debug2 = " + root.val);
        result.add(root.val);
    }

    /**
     * 【迭代】
     * 时间复杂度：O(n)。n 为二叉树结点个数。
     * 空间复杂度：O(n)。n 为栈深度。
     */
    // 后序遍历顺序 左-右-中 入栈顺序：中-左-右 出栈顺序：中-右-左，最后翻转结果
    public static List<Integer> postorderTraversalIterator(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(result);
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

        List<Integer> list = postorderTraversal(root);
        System.out.println("postorderTraversal = " + list.toString());
    }
}
