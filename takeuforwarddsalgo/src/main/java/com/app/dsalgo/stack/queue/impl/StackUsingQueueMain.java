package com.app.dsalgo.stack.queue.impl;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueMain {
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);

        System.out.println("Top of the stack: " + stack.top());
        System.out.println("Size of the stack before removing element: " + stack.size());
        System.out.println("The deleted element is: " + stack.pop());
        System.out.println("Top of the stack after removing element: " + stack.top());
        System.out.println("Size of the stack after removing element: " + stack.size());
    }
}
