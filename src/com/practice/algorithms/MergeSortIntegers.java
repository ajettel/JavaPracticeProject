package com.practice.algorithms;

import java.security.SecureRandom;
import java.util.Arrays;
/**
 * 
 * @author Alexander Jettel
 * @version 0.1
 *	
 * This class is an implementation of a merge sort that operates purely on integers
 */
public class MergeSortIntegers {

	/**
	 * 
	 * @param unsortedList an array of integers that need to be sorted
	 * @return the array of sorted integers
	 */
	public int[] mergeSortIntegers(int[] unsortedList){
		if(unsortedList == null){
			return null;
		}
		
		// If the list is of length 1 or less, it's sorted
		if(unsortedList.length <= 1){
			return unsortedList;
		}

		// split the original unsorted array into two unsorted arrays
		int[] leftList = Arrays.copyOfRange(unsortedList, 0, unsortedList.length/2);
		int[] rightList = Arrays.copyOfRange(unsortedList, unsortedList.length/2, unsortedList.length); // no overlap, the range is exclusive on one end

		// Recursively sort
		int[] sortedLeft = mergeSortIntegers(leftList);
		int[] sortedRight = mergeSortIntegers(rightList);

		// Return the merged result
		return mergeLists(sortedLeft,sortedRight);
	}
	
	/**
	 * 
	 * @param leftList
	 * @param rightList
	 * @return the merged, sorted list
	 */
	public int[] mergeLists(int[] leftList, int[] rightList) {
		if(leftList == null){
			return rightList;
		}
		if(rightList == null){
			return leftList;
		}

		int leftSize = leftList.length;
		int rightSize = rightList.length;
		int leftIndex = 0;
		int rightIndex = 0;
		int mergedIndex = 0;
		int[] mergedList = new int[leftSize + rightSize];

		while(true){
			// Done with both lists
			if(leftSize <= leftIndex && rightSize <= rightIndex){
				return mergedList;
			}
			// Both lists have something in them
			else if(leftSize > leftIndex && rightSize > rightIndex){
				if(leftList[leftIndex] > rightList[rightIndex]){
					mergedList[mergedIndex] = rightList[rightIndex];
					mergedIndex++;
					rightIndex++;
				}
				else{
					mergedList[mergedIndex] = leftList[leftIndex];
					mergedIndex++;
					leftIndex++;
				}
			}
			// Left list is empty, take from the right
			else if(leftSize <= leftIndex && rightSize >= rightIndex){
				mergedList[mergedIndex] = rightList[rightIndex];
				mergedIndex++;
				rightIndex++;
			}
			// Left list is empty, take from the left
			else if(leftSize > leftIndex && rightSize <= rightIndex){
				mergedList[mergedIndex] = leftList[leftIndex];
				mergedIndex++;
				leftIndex++;
			}
			else{
				System.out.println("ERROR");
			}
		}
	}
	public void printList(int[] list){
		if(list == null){
			System.out.println("List empty");
			return;
		}
		int length = list.length;
		for(int ii = 0; ii < length;ii++){
			System.out.print(list[ii]);
			if(ii != length-1){
				System.out.print(", ");
			}
		}
		System.out.println("");

	}
	public int[] generateRandomList(int size, int maxValue){
		int[] randomArray = new int[size];
		SecureRandom numberGenerator = new SecureRandom();
		int currentIndex = 0;
		
		while(currentIndex < size){
			randomArray[currentIndex] = numberGenerator.nextInt(maxValue);
			currentIndex++;
			
		}
		return randomArray;
	}
}
