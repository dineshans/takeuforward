package com.app.dsalgo.stack.queue.impl.linkedlist.stack;

import com.app.dsalgo.linkedlist.singly.basicoperation.Node;

class StackNode {
    int data;
    StackNode next;

    public StackNode() {
        this.data = 0;
        this.next = null;
    }

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackImpl {
    StackNode top = null;
    int size = 0;

    public void push(int data) {
        StackNode temp = new StackNode(data);
        temp.next = top;
        top = temp;
        size++;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int topData = top.data;
        StackNode temp = top;
        top = top.next;
        return topData;
    }

    public int top() {
        return top.data;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        StackNode current = top;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
