package com.jpeony.leetcode.n0654;

/**
 * [654. Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/)
 * [654. 最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/)
 *
 * @author yihonglei
 */
public class N654_MaximumBinaryTree {

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        // 左闭右闭逻辑数组
        return recurse(nums, 0, nums.length - 1);
    }

    private static TreeNode recurse(int[] nums, int l, int r) {
        // 递归终止条件
        if (l > r) {
            return null;
        }
        // 数组最大值下标位置作为左右逻辑子数组分割的边界条件，采用左闭右闭方式
        int maxIndex = max(nums, l, r);
        TreeNode root = new TreeNode(nums[maxIndex]);
        // 左闭右闭 [l, maxIndex - 1]，用 maxIndex - 1 刨掉最大值位置元素
        root.left = recurse(nums, l, maxIndex - 1);
        // 左闭右闭 [maxIndex + 1, r]，用 maxIndex + 1 刨掉最大值位置元素
        root.right = recurse(nums, maxIndex + 1, r);

        return root;
    }

    private static int max(int[] nums, int l, int r) {
        int maxIndex = l;
        for (int i = l; i <= r; i++) {
            if (nums[maxIndex] < nums[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
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
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};

        TreeNode treeNode = constructMaximumBinaryTree(nums);

    }
}
