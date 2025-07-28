package com.app.dsalgo.trees.binaryTree.traversal.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        levelOrderTraversal1(root);
        //List<List<Integer>> result = levelOrderTraversal(root);
        /*for (List<Integer> level : result) {
            printList(level);
        }*/
    }
    // to print in different lines we use for loop
    public static List<List<Integer>> levelOrderTraversal(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode current = queue.poll();
                //System.out.print(" " + current.data);
                list.add(current.data);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            //System.out.println();
            resultList.add(list);
        }
        return resultList;
    }
    // another approach to print in different lines
    // using inserting Null in Queue
    public static void levelOrderTraversal1(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current == null) {
                if (!queue.isEmpty()) {
                    System.out.println();
                    queue.add(null);
                    continue;
                } else {
                    break;
                }
            }
            System.out.print(" " + current.data);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

    }

    static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
