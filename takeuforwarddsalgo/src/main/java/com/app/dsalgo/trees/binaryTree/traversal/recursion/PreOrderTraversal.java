package com.app.dsalgo.trees.binaryTree.traversal.recursion;

import java.util.ArrayList;
import java.util.List;

/*
* PreOrder - Root Left Right
* */
public class PreOrderTraversal {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        List<Integer> list = preOrderTraversal(root);
        System.out.print("Tree is : " + list);
    }
    public static List<Integer> preOrderTraversal(BinaryTreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }
    public static void preOrder(BinaryTreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}

