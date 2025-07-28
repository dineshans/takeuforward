package com.app.dsalgo.stack.queue.impl.linkedlist.stack;

public class StackMain {

    public static void main(String[] args) {

        StackImpl stack = new StackImpl();
        System.out.println("Before poping stack is : ");
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.push(9);
        stack.printStack();
        System.out.println("After popping stack is: ");
        stack.pop();
        stack.pop();
        stack.printStack();

    }
}
