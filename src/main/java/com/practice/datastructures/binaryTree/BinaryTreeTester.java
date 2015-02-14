/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.datastructures.binaryTree;

/**
 * Tests the binary tree implementation
 *
 * @author Alex
 */
public class BinaryTreeTester {

    public BinaryTreeTester() {
        //http://www.cse.unt.edu/~donr/courses/2050/images/Figure1010.gif
        BinaryTree bt = new BinaryTree();
        bt.insert(60);
        bt.insert(20);
        bt.insert(40);
        bt.insert(10);
        bt.insert(30);
        bt.insert(50);
        bt.insert(70);
        bt.printPreOrder();
        bt.printInOrder();
        bt.printPostOrder();

        int searchOne = 30;
        int searchTwo = 84;
        System.out.println();
        System.out.println("Tree contains " + searchOne + ": " + bt.search(searchOne));
        System.out.println("Tree contains " + searchTwo + ": " + bt.search(searchTwo));
        System.out.println();
        System.out.println("Minimum : " + bt.findMin());
        System.out.println("Maximum : " + bt.findMax());
        System.out.println("Tree height : " + bt.getHeight());

    }

}
