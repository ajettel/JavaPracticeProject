/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.datastructures.linkedlist;

/**
 * Single linked list node that holds an int for data
 *
 * @author Alex
 */
public class LinkedListNode {

    private LinkedListNode nextNode;
    private int data;

    /**
     * Constructor that just takes the data stored in the node. Recommended to
     * set next node after this
     *
     * @param data The data to be stored in the node
     */
    public LinkedListNode(int data) {
        this.data = data;
    }

    /**
     * Constructor that takes the next node
     *
     * @param data
     * @param nextNode
     */
    public LinkedListNode(int data, LinkedListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    /**
     * Sets the next node for this node
     *
     * @param nextNode
     */
    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * Returns the data stored in this node
     *
     * @return The data
     */
    public int getData() {
        return data;
    }

    /**
     * Returns the next node in the list
     *
     * @return the next node
     */
    public LinkedListNode getNext() {
        return nextNode;
    }

}
