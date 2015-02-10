/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.datastructures.linkedlist;

/**
 * Runs the tests for single linked lists
 *
 * @author Alex
 */
public class LinkedListTest {

    public void startExercises() {
        int listSize = 10;
        LinkedListNode head = generateOrderedLinkedList(listSize);
        printLinkedList(head, "Original linked list");
        swapFourthAndFifthNodeTest(head);
        printLinkedList(head, "Swapped fourth and fifth element");
        swapFourthAndFifthNodeTest(head);
        printLinkedList(head, "Swapped fourth and fifth element again.");
        swapThirdAndSeventhNodeTest(head);
        printLinkedList(head, "Swapped third and sevents element.");
    }

    /**
     * Builds a linked list and returns the head. The data contained will start
     * at 1 and increase monotonically every node
     *
     * @param listSize The size of the list
     * @return The head of a linked list
     */
    private LinkedListNode generateOrderedLinkedList(int listSize) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode currentNode = head;
        for (int ii = 2; ii <= listSize; ii++) {
            LinkedListNode tmp;
            tmp = new LinkedListNode(ii);
            currentNode.setNextNode(tmp);
            currentNode = currentNode.getNext();
        }
        return head;
    }

    /**
     * Prints a linked list to System.out
     *
     * @param head The head of the list
     * @param message A message to print before the list
     */
    public void printLinkedList(LinkedListNode head, String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message).append("\n");
        LinkedListNode currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.getData());
            if (currentNode.getNext() != null) {
                sb.append("->");
            }
            currentNode = currentNode.getNext();
        }
        System.out.println(sb.toString());
    }

    /**
     * Swaps the fourth and fifth node. Assumes a list size >= 5
     *
     * @param head The head of the list
     */
    private void swapFourthAndFifthNodeTest(LinkedListNode head) {
        LinkedListNode current = head;
        // Go to third node;
        for (int ii = 0; ii < 2; ii++) {
            current = current.getNext();
        }
        // keep track of the node we are temporarily taking out
        LinkedListNode fourthNode = current.getNext();
        current.setNextNode(current.getNext().getNext());
        // Set the correct next record fort he removed node
        fourthNode.setNextNode(current.getNext().getNext());
        // Insert the node back in
        current.getNext().setNextNode(fourthNode);

    }

    /**
     * Swaps the Third and seventh node. Assumes a list size >= 7
     *
     * @param head The head of the list
     */
    private void swapThirdAndSeventhNodeTest(LinkedListNode head) {
        LinkedListNode secondNode = head.getNext();
        LinkedListNode sixthNode = head;
        LinkedListNode seventhNode = null;

        for (int ii = 0; ii < 5; ii++) {
            sixthNode = sixthNode.getNext();
            seventhNode = sixthNode.getNext();
        }

        LinkedListNode thirdNode = secondNode.getNext();
        LinkedListNode fourthNode = thirdNode.getNext();

        secondNode.setNextNode(seventhNode);
        sixthNode.setNextNode(thirdNode);
        thirdNode.setNextNode(seventhNode.getNext());
        seventhNode.setNextNode(fourthNode);

    }
}
