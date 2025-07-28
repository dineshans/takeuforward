package com.app.dsalgo.stack.queue.impl.linkedlist.queue;

public class QueueImplMain {

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.push(5);
        queue.push(8);
        queue.push(4);
        queue.push(2);
        queue.printQueue();
        System.out.println("Top element in queue is : " + queue.top());
        System.out.println("Pop out data : " + queue.pop());
        queue.printQueue();

    }
}
