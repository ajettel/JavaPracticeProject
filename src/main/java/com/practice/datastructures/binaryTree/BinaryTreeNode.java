/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.datastructures.binaryTree;

/**
 * A binary tree node. Contained data is immutable
 *
 * @author Alex
 */
public class BinaryTreeNode {

    private final int data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    /**
     * Constructs a node with the given data
     *
     * @param data
     */
    public BinaryTreeNode(int data) {
        this.data = data;
    }

    /**
     * Returns the data contained in the node
     *
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * Gets the left child of this node. May be null
     *
     * @return The left child
     */
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    /**
     * Sets the left child of this node
     *
     * @param left The left child
     */
    public void setLeftChild(BinaryTreeNode left) {
        this.leftChild = left;
    }

    /**
     * Gets the right child of this node. May be null
     *
     * @return The right child
     */
    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    /**
     * Sets the right child of this node
     *
     * @param right The right child
     */
    public void setRightChild(BinaryTreeNode right) {
        this.rightChild = right;
    }

    /**
     * Checks whether the node has a left child
     *
     * @return true if it exists, false if not
     */
    public boolean hasLeftChild() {
        return (leftChild != null);
    }

    /**
     * Checks whether the node has a right child
     *
     * @return true if it exists, false if not
     */
    public boolean hasRightChild() {
        return (rightChild != null);
    }

    /**
     * Removes the left child of this node
     */
    public void removeLeftChild() {
        leftChild = null;
    }

    /**
     * Removes the right child of this node
     */
    public void removeRightChild() {
        rightChild = null;
    }
}
