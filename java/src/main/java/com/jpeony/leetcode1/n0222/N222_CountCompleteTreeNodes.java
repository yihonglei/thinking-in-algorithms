package com.jpeony.leetcode1.n0222;

/**
 * [222. Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)
 * [222. 完全二叉树的结点个数](https://leetcode.cn/problems/count-complete-tree-nodes/)
 *
 * @author yihonglei
 */
public class N222_CountCompleteTreeNodes {

    /**
     * 先序，中序，后序均可遍历出结点个数，但是时间复杂度高。
     */
    public static int countNodes(TreeNode root) {

        return 0;
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

    }
}
