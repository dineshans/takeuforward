package com.app.dsalgo.stack.queue.impl;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>();
    public void push(int element) {
        queue.add(element);
        for (int i = 0; i < queue.size()-1; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    int top() {
        return queue.peek();
    }
    int size() {
        return queue.size();
    }
}
