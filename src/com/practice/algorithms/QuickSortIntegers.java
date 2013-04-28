package com.practice.algorithms;

import java.security.SecureRandom;
import java.util.ArrayList;
/**
 * 
 * @author Alexander Jettel
 * @version 0.1
 *	
 * This class is an implementation of a quicksort that operates purely on Integers
 */
public class QuickSortIntegers {

	/**
	 * This function sorts an ArrayList of Integers with quicksort. It makes an 
	 * uninformed selection of a pivot by selecting the middle element and putting the 
	 * elements in a list that's less than and a list that's more than the pivot. It
	 * then proceeds to recursively sort those two lists before appending them again to 
	 * each other
	 * @param unsortedList The list to be sorted
	 * @return The sorted list
	 */
	public ArrayList<Integer> quickSortIntegers(ArrayList<Integer> unsortedList){
		if(unsortedList == null){
			return null;
		}
		if(unsortedList.size() <= 1){
			return unsortedList;
		}

		int pivot = unsortedList.get(unsortedList.size()/2); // uninformed pivot selection
		unsortedList.remove(unsortedList.size()/2); // Remove the pivot for easier iteration

		
		ArrayList<Integer> lessThan = new ArrayList<Integer>();
		ArrayList<Integer> moreThan = new ArrayList<Integer>();

		// Sort the integers into the two different ArrayLists
		for(Integer currentNumber : unsortedList){
			if(currentNumber < pivot){
				lessThan.add(currentNumber);
			}
			else{
				moreThan.add(currentNumber);
			}
		}
		// Recursive call
		ArrayList<Integer> sortedLessThan = quickSortIntegers(lessThan);
		ArrayList<Integer> sortedMoreThan = quickSortIntegers(moreThan);
		
		// Just add everything to the end of the sortedLessThan ArrayList and return it
		sortedLessThan.add(pivot);
		sortedLessThan.addAll(sortedMoreThan);
		
		return sortedLessThan;
	}
	/**
	 * A helper function that prints out an ArrayList of integers
	 * @param list The ArrayList to be printed
	 */

	public void printList(ArrayList<Integer> list){
		if(list == null){
			System.out.println("List empty");
			return;
		}
		int length = list.size();
		for(int ii = 0; ii < length;ii++){
			System.out.print(list.get(ii));
			if(ii != length-1){
				System.out.print(", "); // Don't insert a comma after the last element
			}
		}
		System.out.println("");

	}
	/**
	 * A helper function that generates a list of 'size' with the 'maxValue' as the highest value in it
	 * @param size The size of the random list generated
	 * @param maxValue The maximum value found in the list [0, maxValue]
	 * @return The generated list
	 */
	public ArrayList<Integer> generateRandomList(int size, int maxValue){
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>(); 
		SecureRandom numberGenerator = new SecureRandom();
		int currentIndex = 0;
		
		while(currentIndex < size){
			randomNumbers.add(numberGenerator.nextInt(maxValue));
			currentIndex++;
		}
		
		return randomNumbers;
	}
}
