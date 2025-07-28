package com.app.dsalgo.stack.queue.impl.monotonic.problems;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String str = "()[{}()]";
        System.out.println(isValidParentheses(str));

    }
    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') { // opening
                stack.push(ch[i]);
            } else {
                if (stack.isEmpty()) return false;
                if ((stack.peek() == '(' && ch[i] == ')')
                        || (stack.peek() == '{' && ch[i] == '}')
                    || (stack.peek() == '[' && ch[i] == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
