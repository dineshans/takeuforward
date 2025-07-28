package com.app.dsalgo.trees.binaryTree.traversal.iterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* PreOrder Traversal Iterative way = use stack
* */
public class PreInPostOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        List<Integer> preOrderList = preOrderTraversal(root);
        System.out.println("Binary Tree - PreOrderTraversal : " + preOrderList);
        List<Integer> inOrderList = inOrderTraversal(root);
        System.out.println("Binary Tree - inOrderList : " + inOrderList);
    }
    public static List<Integer> preOrderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.pop();
            result.add(current.data);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return result;
    }
    public static List<Integer> inOrderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
        while(true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                } else {
                    node = stack.pop();
                    result.add(node.data);
                    node = node.right;
                }
            }
        }
        return result;
    }
}
