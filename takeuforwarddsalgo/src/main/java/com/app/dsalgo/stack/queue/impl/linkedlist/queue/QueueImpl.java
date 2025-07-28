package com.app.dsalgo.stack.queue.impl.linkedlist.queue;

public class QueueImpl {

    class QueueNode {
        int data;
        QueueNode next;
        public QueueNode() {
            this.data = 0;
            this.next = null;
        }
        public QueueNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    QueueNode end = null;
    QueueNode start = null;
    int size = 0;

    public void push(int data) {
        QueueNode temp = new QueueNode(data);
        if (start == null) {
            start = temp;
            end = temp;
        } else {
            end.next = temp;
            end = temp;
        }
        size++;
    }

    public int pop() {
        int popData = start.data;
        start = start.next;
        size--;
        return popData;
    }

    public int top() {
        if (start == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return start.data;
    }

    public void printQueue() {
        QueueNode temp = start;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println(" ");
    }
}
