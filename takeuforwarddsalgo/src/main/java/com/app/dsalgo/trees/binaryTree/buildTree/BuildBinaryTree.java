package com.app.dsalgo.trees.binaryTree.buildTree;

/*
* Given an Array, build binary tree from arrays
* -1 represent that no node - null
* */
public class BuildBinaryTree {
    private static int idx = -1;
    public static void main(String[] args) {
        int[] preOrder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        BuildTreeNode root = buildTree(preOrder);
        System.out.print("Tree is :" + root.data + " " + root.left.data + " "
                + root.right.data + " " + root.right.left.data + " " +
        root.right.right.data);
    }
    public static BuildTreeNode buildTree(int[] preOrder) {
        idx++;
        if (preOrder[idx] == -1) {
            return null;
        }
        BuildTreeNode root = new BuildTreeNode(preOrder[idx]);
        root.left = buildTree(preOrder);
        root.right = buildTree(preOrder);
        return root;
    }
}
