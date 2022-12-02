package com.jpeony.leetcode.n0450;

/**
 * [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)
 * [450. 删除二叉搜索树中的结点](https://leetcode.cn/problems/delete-node-in-a-bst/)
 *
 * @author yihonglei
 */
public class N450_DeleteNodeInABST {

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {// 继续往左边找等值
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {// 继续往右边找等值
            root.right = deleteNode(root.right, key);
        } else {// 删除当前等值结点
            // 如果左结点为空，直接用右结点替换当前结点
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {// 如果右几点为空，直接用左结点替换当前结点
                return root.left;
            } else {
                // 寻找当前结点的中序后继结点，即右子树中最左子结点
                TreeNode prev = root;
                TreeNode next = root.right;
                while (next.left != null) {
                    prev = next;
                    next = next.left;
                }
                // 先删除最左子结点
                if (prev == root) {
                    prev.right = next.right;
                } else {
                    prev.left = next.right;
                }
                // 再删除当前结点
                root.val = next.val;
            }
        }

        return root;
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
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        int key = 3;

        TreeNode treeNode = deleteNode(root, 3);

    }
}
