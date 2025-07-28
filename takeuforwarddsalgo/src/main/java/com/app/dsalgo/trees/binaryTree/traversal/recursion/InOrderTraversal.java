package com.app.dsalgo.trees.binaryTree.traversal.recursion;

import java.util.ArrayList;
import java.util.List;
/*
* InOrder - Left Root right
*
* */
public class InOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        List<Integer> list = InOrderTraversal(root);
        System.out.print("Tree is : " + list);
    }
    public static List<Integer> InOrderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }
    public static void inOrder(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
}
