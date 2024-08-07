package com.jpeony.leetcode1.n0617;

/**
 * [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)
 * [617. 合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/)
 *
 * @author yihonglei
 */
public class N617_MergeTwoBinaryTrees {

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) { // 入参
        // 终止条件
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        // 单层逻辑
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged; // 返参
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

        TreeNode treeNode = mergeTrees(root, root);
    }
}
