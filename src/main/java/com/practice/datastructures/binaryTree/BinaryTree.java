/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.datastructures.binaryTree;

/**
 * This class implements a binary tree
 *
 * @author Alex
 */
public class BinaryTree {

    BinaryTreeNode root = null;

    /**
     * Construct an empty binary tree;
     */
    public BinaryTree() {

    }

    /**
     * Inserts a node with the given data into the tree
     *
     * @param data The data to be inserted
     */
    public void insert(int data) {
        System.out.println("Inserting " + data);
        root = insertIntoTree(root, data);
    }

    /**
     * Creates a node with the given data and adds it as a child to the given
     * node
     *
     * @param node The node to which to add the child data
     * @param data The data to be added
     * @return The node which was created and contains the data
     */
    private BinaryTreeNode insertIntoTree(BinaryTreeNode node, int data) {
        if (node == null) {
            node = new BinaryTreeNode(data);
        } else if (node.getData() >= data) {
            node.setLeftChild(insertIntoTree(node.getLeftChild(), data));
        } else if (node.getData() < data) {
            node.setRightChild(insertIntoTree(node.getRightChild(), data));
        }
        return node;
    }

    /**
     * Prints the tree in preorder
     */
    public void printPreOrder() {
        if (root == null) {
            return;
        }
        System.out.println("\nPreOrder: ");
        printPreOrderNode(root);
    }

    /**
     * Prints a node in preorder
     *
     * @param node The node to be printed
     */
    private void printPreOrderNode(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        printPreOrderNode(node.getLeftChild());
        printPreOrderNode(node.getRightChild());
    }

    /**
     * Prints the tree inorder
     */
    public void printInOrder() {
        if (root == null) {
            return;
        }
        System.out.println("\nInOrder: ");
        printInOrderNode(root);
    }

    /**
     * Prints a node in inorder
     *
     * @param node The node to be printed
     */
    private void printInOrderNode(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        printInOrderNode(node.getLeftChild());
        System.out.print(node.getData() + " ");
        printInOrderNode(node.getRightChild());
    }

    /**
     * Prints the tree inorder
     */
    public void printPostOrder() {
        if (root == null) {
            return;
        }
        System.out.println("\nPostOrder: ");
        printPostOrderNode(root);
    }

    /**
     * Prints a node in postorder
     *
     * @param node The node to be printed
     */
    private void printPostOrderNode(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        printPostOrderNode(node.getLeftChild());
        printPostOrderNode(node.getRightChild());
        System.out.print(node.getData() + " ");
    }

    /**
     * CHecks if the list contains a node with the data given
     *
     * @param data The data given
     * @return true if such node exists, false otherwise
     */
    public boolean search(int data) {
        return searchForData(root, data);
    }

    /**
     * Searches if a node or its children contains the given data
     *
     * @param node The node which to check
     * @param data The data which is to be found
     * @return true if a node exists that has such data, false otherwise
     */
    private boolean searchForData(BinaryTreeNode node, int data) {
        if (node == null) {
            return false;
        }
        if (node.getData() == data) {
            return true;
        } else if (node.getData() > data) {
            return searchForData(node.getLeftChild(), data);
        } else {
            return searchForData(node.getRightChild(), data);
        }
    }

    /**
     * Finds the node with the smallest value in the tree
     *
     * @return the value contained in the smallest node
     */
    public int findMin() {
        if (root == null) {
            return -1;
        }
        return findMin(root);
    }

    /**
     * Checks if a node contains the smallest value in the tree
     *
     * @param node The node which to check
     * @return The smallest entry in this node or its children
     */
    private int findMin(BinaryTreeNode node) {
        if (node.hasLeftChild()) {
            return findMin(node.getLeftChild());
        }
        return node.getData();

    }

    /**
     * Finds the node with the biggest value in the tree
     *
     * @return the value contained in the biggest node
     */
    public int findMax() {
        if (root == null) {
            return -1;
        }
        return findMax(root);
    }

    /**
     * Checks if a node contains the biggest value in the tree
     *
     * @param node The node which to check
     * @return The biggest entry in this node or its children
     */
    private int findMax(BinaryTreeNode node) {
        if (node.hasRightChild()) {
            return findMax(node.getRightChild());
        }
        return node.getData();
    }

    /**
     * Gets the height of the binary tree
     *
     * @return The height of the tree
     */
    public int getHeight() {
        return findHeight(root);
    }

    /**
     * Finds the height of a given node
     *
     * @param node The node for which to find the height
     * @return the height
     */
    private int findHeight(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = findHeight(node.getLeftChild());
        int rightHeight = findHeight(node.getRightChild());

        int max = Integer.max(leftHeight, rightHeight);
        return max + 1;
    }

}
