package com.app.dsalgo.trees.binaryTree.traversal.recursion;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
