package com.jpeony.leetcode.n0590;

import java.util.ArrayList;
import java.util.List;

/**
 * [590. N 叉树的后序遍历](https://leetcode.cn/problems/n-ary-tree-postorder-traversal/description/)
 */
public class NAryTreePostorderTraversal {

    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    public static void dfs(Node cur, List<Integer> result) {
        if (cur == null) {
            return;
        }

        for (Node c : cur.children) {
            dfs(c, result);
        }
        result.add(cur.val);
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }
}
