package com.practice;

import com.practice.algorithms.MergeSortIntegers;
import com.practice.algorithms.QuickSortIntegers;
import com.practice.algorithms.RecursiveBinarySearch;
import com.practice.dataoperations.BitShifter;
import com.practice.dataoperations.MyHashMap;
import com.practice.dataoperations.RegExpTester;
import com.practice.datastructures.binaryTree.BinaryTreeTester;
import com.practice.datastructures.linkedlist.LinkedListTest;
import com.practice.fileio.TextfileWriter;
import com.practice.util.ArrayHelper;
import java.util.ArrayList;

/**
 * This is the main function that executes the examples in this project
 *
 * @author Alex
 *
 */
public class MainDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {

        startHashmapExercises();
        startMergesortExercise();
        startQuicksortExercise();
        startFileIOExercises();
        startBitshiftingExercise();
        startLinkedListExercises();
        startRecursiveBinarySearchExercises();
        startBinaryTreeExercises();

        // Done all the testing
        //startRegExpExercises(); // Not done yet
        System.out.println("\nDone");
    }

    /**
     * Starts the regular expression exercises
     */
    private static void startRegExpExercises() {
        System.out.println("Regular Expression Exercise:");
        System.out.println("------------------");

        RegExpTester tester = new RegExpTester();
        tester.start();

    }

    /**
     * Starts the bitshifting exercises
     */
    private static void startBitshiftingExercise() {
        System.out.println("\n\nBitshifting Exercise:");
        System.out.println("------------------");

        BitShifter shifter = new BitShifter();
        shifter.startExercise();
    }

    /**
     * Starts the file I/O exercises
     */
    private static void startFileIOExercises() {
        // File I/O
        System.out.println("\n\nFile I/O Exercise:");
        System.out.println("------------------");

        TextfileWriter writeFiles = new TextfileWriter();
        if (writeFiles.startWriting()) {
            System.out.println("Files have been written successfully");
        } else {
            System.out.println("There has been an error writing the files");
        }
    }

    /**
     * Starts the quicksort exercises
     */
    private static void startQuicksortExercise() {
        // Quicksorting
        System.out.println("\n\nQuicksort Exercise:");
        System.out.println("-------------------");

        QuickSortIntegers quickSorter = new QuickSortIntegers();

        ArrayList<Integer> unsortedList = ArrayHelper.generateRandomIntegerList(10, 50);

        System.out.println("Unsorted List");
        quickSorter.printList(unsortedList);

        System.out.println("Sorted List");
        quickSorter.printList(quickSorter.quickSortIntegers(unsortedList));
    }

    /**
     * Starts the mergesort exercises
     */
    private static void startMergesortExercise() {
        System.out.println("\n\nMergesort Exercise:");
        System.out.println("-------------------");

        MergeSortIntegers mergeSorter = new MergeSortIntegers();
        int[] unsorted = mergeSorter.generateRandomList(10, 100);

        System.out.println("Unsorted List");
        mergeSorter.printList(unsorted);

        System.out.println("Sorted List");
        mergeSorter.printList(mergeSorter.mergeSortIntegers(unsorted));
    }

    /**
     * Starts the hashmap exercises
     */
    private static void startHashmapExercises() {
        System.out.println("\n\nHashmap Exercise:");
        System.out.println("-----------------");

        MyHashMap hash = new MyHashMap();
        hash.addRandomStudents();

    }

    /**
     * Starts the linked list exercises
     */
    private static void startLinkedListExercises() {
        System.out.println("\n\nLinked List Exercise:");
        System.out.println("-----------------");

        LinkedListTest llTest = new LinkedListTest();
        llTest.startExercises();
    }

    /**
     * Starts the recursive binary search exercise
     */
    private static void startRecursiveBinarySearchExercises() {
        System.out.println("\n\nRecursive Binary Search Exercise:");
        System.out.println("-----------------");

        RecursiveBinarySearch bSearch = new RecursiveBinarySearch();
        bSearch.startRecursiveBinarySearch();
    }

    /**
     * Starts the binary tree exercise
     */
    private static void startBinaryTreeExercises() {
        System.out.println("\n\n Binary Tree Exercise:");
        System.out.println("-----------------");

        BinaryTreeTester bSearch = new BinaryTreeTester();
    }

}
