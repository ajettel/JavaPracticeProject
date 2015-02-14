/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.algorithms;

import com.practice.util.ArrayHelper;
import java.util.Date;
import java.util.Random;

/**
 * Recursive binary search
 *
 * @author Alex
 */
public class RecursiveBinarySearch {

    private final Random rnd = new Random(new Date().getTime());

    public RecursiveBinarySearch() {
    }

    /**
     * Starts the test
     */
    public void startRecursiveBinarySearch() {
        // Make it reasonably big
        int arraySize = rnd.nextInt(2000000) + 20000000;
        int[] sortedArray = ArrayHelper.generateRandomIntegerArray(arraySize);
        int start = 0;
        int end = sortedArray.length - 1;
        int searchValue = sortedArray[rnd.nextInt(sortedArray.length)];

        System.out.println("Searching for " + searchValue + " Array size: " + sortedArray.length);

        long startTime = System.nanoTime();
        int position = searchList(sortedArray, searchValue, start, end);
        long stopTime = System.nanoTime();
        long runTime = (stopTime - startTime);
        System.out.println("Position of element:" + position + ". Value: " + sortedArray[position] + " Correct ? " + (sortedArray[position] == searchValue));
        System.out.println("Searchtime: " + runTime + " nanoseconds");
    }

    /**
     * Binary-searches a sorted array of integers
     *
     * @param sortedArray The entire sorted array
     * @param searchValue The value to be searched
     * @param start The start position from which the search will commence
     * @param end The end position until where in the array the binary search
     * will look
     * @return The position of the element. Returns -1 if not found
     */
    private int searchList(int[] sortedArray, int searchValue, int start, int end) {
        // Found the value
        if (start == end && sortedArray[start] == searchValue) {
            return start;
        }
        int middle = (start + end) / 2;

        if (sortedArray[middle] > searchValue) {
            System.out.println(sortedArray[middle] + " is bigger than " + searchValue + ". Searching from index " + start + " to " + (middle - 1));
            return searchList(sortedArray, searchValue, start, middle - 1);
        } else if (sortedArray[middle] == searchValue) {
            return middle;
        } else if (sortedArray[middle] < searchValue) {
            System.out.println(sortedArray[middle] + " is less than " + searchValue + ". Searching from index " + (middle + 1) + " to " + end);
            return searchList(sortedArray, searchValue, middle + 1, end);
        }

        return -1;
    }
}
