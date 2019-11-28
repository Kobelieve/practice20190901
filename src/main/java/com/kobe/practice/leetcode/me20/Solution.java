package com.kobe.practice.leetcode.me20;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description 有效的括号
 * @Author Tao
 * @Date: 2019-11-28 10:08
 */
public class Solution {
    /*
        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
        有效字符串需满足：
            1.左括号必须用相同类型的右括号闭合。
            2.左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。
     */

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("{{[([)]}}"));
    }

    public boolean isValid(String str) {

        // 符号长度为奇数的话，则直接返回false
        if ((str.length() & 1) == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else {
                // 只需要处理右括号，左括号压入栈即可
                switch (str.charAt(i)) {
                    case ')': {
                        if (stack.pop() != '(') {
                            return false;
                        }
                        break;
                    }
                    case ']': {
                        if (stack.pop() != '[') {
                            return false;
                        }
                        break;
                    }
                    case '}': {
                        if (stack.pop() != '{') {
                            return false;
                        }
                        break;
                    }
                    default: {
                        stack.push(str.charAt(i));
                    }
                }
            }
        }

        // 如果经历了switch case还不为空的话，说明栈底有重复的括号
        if (!stack.empty()) {
            return false;
        }

        return true;
    }

}
