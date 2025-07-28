package com.app.dsalgo.string.basic;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Software";
        //String resultStr = reverseString(input);
        //String resultStr = reverseStringUsingBuilder(input);
        String resultStr = reverseStringUsingStack(input);
        System.out.println("String reverse: " + resultStr);
    }

    // using stack
    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }

    // using String builder
    public static String reverseStringUsingBuilder(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    // using String
    public static String reverseString(String str) {
        int strLength = str.length()-1;
        String outputStr = "";
        for(int i = strLength; i >= 0; i--) {
            //char reverse = str.charAt(i);
            outputStr = outputStr + str.charAt(i);
        }
        return outputStr;
    }
}
