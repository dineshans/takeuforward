package com.app.dsalgo.stack.queue.impl.array;

import java.util.Stack;

public class DesignGetMinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(4);
        minStack.push(10);
        minStack.push(16);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

class MinStack {
    Stack<Pairs> stack = new Stack<>();
    public void push(int data) {
        if (stack.isEmpty()) {
            stack.push(new Pairs(data,data));
        } else {
            stack.push(new Pairs(data, Math.min(stack.peek().second, data)));
        }
    }
    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().first;
    }

    public int getMin() {
        return stack.peek().second;
    }
}
class Pairs {
    int first;
    int second;
    public Pairs(int x, int y) {
        this.first = x;
        this.second = y;
    }
}
