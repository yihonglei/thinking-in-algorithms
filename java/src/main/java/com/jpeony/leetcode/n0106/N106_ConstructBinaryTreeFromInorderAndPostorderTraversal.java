package com.jpeony.leetcode.n0106;

import java.util.HashMap;

/**
 * [106. Construct Binary Tree from Inorder and Postorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
 * [106. 从中序与后序遍历序列构造二叉树](https://leetcode.cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/)
 *
 * @author yihonglei
 */
public class N106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    static HashMap<Integer, Integer> inorderArrayMap = new HashMap<Integer, Integer>();
    static int[] post;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderArrayMap.put(inorder[i], i); // 将节点和索引全部记录在哈希表中
        }

        post = postorder;

        return buildTree(0, inorder.length - 1, 0, post.length - 1);
    }

    private static TreeNode buildTree(int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {
        if (inorderEnd < inorderStart || postorderEnd < postorderStart) {
            return null;
        }

        int root = post[postorderEnd];// 根据后序遍历结果，取得根节点
        int rootIndexInInorderArray = inorderArrayMap.get(root);// 获取对应的索引

        TreeNode node = new TreeNode(root); // 创建该节点
        node.left = buildTree(inorderStart, rootIndexInInorderArray - 1, postorderStart, postorderStart + rootIndexInInorderArray - inorderStart - 1);
        node.right = buildTree(rootIndexInInorderArray + 1, inorderEnd, postorderStart + rootIndexInInorderArray - inorderStart, postorderEnd - 1);
        return node;
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
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};

        TreeNode treeNode = buildTree(inorder, postorder);

    }
}
