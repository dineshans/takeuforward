package com.app.dsalgo.stack.queue.impl;

import java.util.Stack;

public class DesignMinStackOptimizedApproach {

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        DesignMinStackOptimizedApproach minStack = new DesignMinStackOptimizedApproach();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
    public void push(int val) {
        if (stack.isEmpty()) {
            min = val;
            stack.push(val);
        } else {
            if (val < min) {
                stack.push(2*val - min);
                min = val;
            } else {
                stack.push(val);
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, can not pop value");
            return;
        }
        if (stack.peek() < min) {
            min = (2*min - stack.peek());
        }
        stack.pop();
    }

    public int top() {
        if (stack.peek() < min) {
            return min;
        }
        return stack.peek();
    }
    public int getMin() {
        return min;
    }
}
