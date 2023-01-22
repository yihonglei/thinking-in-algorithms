package com.jpeony.leetcode2.n1047;

/**
 * [1047. Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
 * [1047. 删除字符串中的所有相邻重复项](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/)
 *
 * @author yihonglei
 */
public class N1047_RemoveAllAdjacentDuplicatesInString {

    /**
     * 【栈】
     * 时间复杂度：O(n)。n 为字符串字符个数；
     * 空间复杂度：O(n)。n 为去重后字符串字符个数。
     */
    private static String removeDuplicates(String s) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "azxxzy";

        String after = removeDuplicates(s);

        System.out.println("after = " + after);
    }
}
