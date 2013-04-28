package com.practice.algorithms;

import java.security.SecureRandom;
import java.util.ArrayList;

public class QuickSortIntegers {

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

		for(Integer currentNumber : unsortedList){
			if(currentNumber < pivot){
				lessThan.add(currentNumber);
			}
			else{
				moreThan.add(currentNumber);
			}
		}
		ArrayList<Integer> sortedLessThan = quickSortIntegers(lessThan);
		ArrayList<Integer> sortedMoreThan = quickSortIntegers(moreThan);
		
		sortedLessThan.add(pivot);
		sortedLessThan.addAll(sortedMoreThan);
		
		return sortedLessThan;
	}
	
	public void printList(ArrayList<Integer> list){
		if(list == null){
			System.out.println("List empty");
			return;
		}
		int length = list.size();
		for(int ii = 0; ii < length;ii++){
			System.out.print(list.get(ii));
			if(ii != length-1){
				System.out.print(", ");
			}
		}
		System.out.println("");

	}
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
