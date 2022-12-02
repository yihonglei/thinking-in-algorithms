package com.jpeony.leetcode.n0513;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [513. Find Bottom Left Tree Value](https://leetcode.com/problems/find-bottom-left-tree-value/)
 * [513. 找树左下角的值](https://leetcode.cn/problems/find-bottom-left-tree-value/)
 *
 * @author yihonglei
 */
public class N513_FindBottomLeftTreeValue {

    public static int findBottomLeftValue(TreeNode root) {

        return 0;
    }

    /**
     * 深度优先
     */
    public static int dfs(TreeNode root) {

        return 0;
    }

    /**
     * 广度优先
     */
    public static int bfs(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelCurrentSize = queue.size();
            for (int i = 1; i <= levelCurrentSize; i++) {
                TreeNode node = queue.poll();
                // 每一层的第一个值更新，最后一定是最底层 最左结点的值
                if (i == 1) {
                    ans = node.val;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return ans;
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

        int val = findBottomLeftValue(root);
        System.out.println("findBottomLeftValue = " + val);
    }
}
