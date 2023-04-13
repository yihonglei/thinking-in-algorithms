package com.jpeony.leetcode.n0098;

/**
 * [98. 验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/)
 *
 * @author yihonglei
 */
public class N98_ValidateBinarySearchTree {

    private static long maxValue = Long.MIN_VALUE; // 记录前一个节点值

    // 存在缺陷，如果最左节点是 Long.MIN_VALUE 时，无法进行判断处理，替换不了 maxValue
    public static boolean isValidBSTOne(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBSTOne(root.left);
        // 中
        if (root.val > maxValue) {
            maxValue = root.val;
        } else {
            return false;
        }
        // 右
        boolean right = isValidBSTOne(root.right);
        return left && right;
    }

    private static TreeNode max;
    public static boolean isValidBSTTwo(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBSTTwo(root.left);
        // 中
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        // 右
        boolean right = isValidBSTTwo(root.right);
        return left && right;
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
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        root.left = node1;
        root.right = node2;
    }
}
