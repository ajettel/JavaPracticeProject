package com.practice.util;

import com.practice.algorithms.MergeSortIntegers;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * A small class that provides some helper function for dealing with arrays
 *
 * @author Alex
 */
public class ArrayHelper {

    /**
     * A helper function that generates a list of 'size' with the 'maxValue' as
     * the highest value in it
     *
     * @param size The size of the random list generated
     * @param maxValue The maximum value found in the list [0, maxValue]
     * @return The generated list
     */
    public static ArrayList<Integer> generateRandomIntegerList(int size, int maxValue) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        SecureRandom numberGenerator = new SecureRandom();
        int currentIndex = 0;

        while (currentIndex < size) {
            randomNumbers.add(numberGenerator.nextInt(maxValue));
            currentIndex++;
        }

        return randomNumbers;
    }

    /**
     * Creates an array of integers with the given arraySize. The array is
     * filled with numbers between 0 and 2 * arraySize
     *
     * @param arraySize the size of the result array
     * @return The integer array, filled with random numbers
     */
    public static int[] generateRandomIntegerArray(int arraySize) {
        Random rnd = new Random(new Date().getTime());
        int[] randomList = new int[arraySize];

        for (int ii = 0; ii < randomList.length; ii++) {
            // Make sure there's little chance for repeated numbers
            randomList[ii] = rnd.nextInt(2 * arraySize);
        }
        MergeSortIntegers mS = new MergeSortIntegers();
        return mS.mergeSortIntegers(randomList);
    }
}
