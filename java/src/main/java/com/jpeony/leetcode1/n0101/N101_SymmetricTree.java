package com.jpeony.leetcode1.n0101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 * [101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree/)
 *
 * @author yihonglei
 */
public class N101_SymmetricTree {

    /**
     * 【迭代】
     * 时间复杂度：O(n)。每个点进队出队各一次。
     * 空间复杂度：O(n)。队列元素不超过 n 个。
     */
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();

            if (l == null && r == null) {
                continue;
            }

            if ((l == null || r == null) || (l.val != r.val)) {
                return false;
            }

            queue.offer(l.left);
            queue.offer(r.right);

            queue.offer(l.right);
            queue.offer(r.left);
        }

        return true;
    }

    /**
     * 【递归】
     */
    public static boolean isSymmetricR(TreeNode root) {
        if (root == null) {
            return true;
        }
        //调用递归函数，比较左节点，右节点
        return dfs(root.left, root.right);
    }

    public static boolean dfs(TreeNode left, TreeNode right) {
        //递归的终止条件是两个节点都为空
        //或者两个节点中有一个为空
        //或者两个节点的值不相等
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
        //再递归的比较 左节点的左孩子 和 右节点的右孩子
        //以及比较  左节点的右孩子 和 右节点的左孩子
        return dfs(left.left, right.right) && dfs(left.right, right.left);
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

        boolean isSymmetric = isSymmetric(root);
        System.out.println("isSymmetric = " + isSymmetric);
    }
}
