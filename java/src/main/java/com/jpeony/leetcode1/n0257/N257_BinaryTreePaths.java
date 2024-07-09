package com.jpeony.leetcode1.n0257;

import java.util.*;

/**
 * [257. Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)
 * [257. 二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/)
 *
 * @author yihonglei
 */
public class N257_BinaryTreePaths {

    /**
     * 深度优先
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        dfs(root, paths, "");
        return paths;
    }

    public static void dfs(TreeNode root, List<String> paths, String temp) {
        if (root == null) {
            return;
        }

        StringBuilder path = new StringBuilder();
        path.append(temp); // 旧
        path.append(root.val); // 新
        if (root.left == null && root.right == null) {
            paths.add(path.toString());
        } else {
            path.append("->");
            dfs(root.left, paths, path.toString());

            dfs(root.right, paths, path.toString());
        }
    }

    /**
     * 广度优先
     */
    public static List<String> bfs(TreeNode root) {

        return null;
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
        TreeNode node3 = new TreeNode(5);

        root.left = node1;
        root.right = node2;

        node1.right = node3;

        List<String> paths = binaryTreePaths(root);
        System.out.println("paths = " + paths);
    }
}
