package com.practice;

import java.util.ArrayList;

import com.practice.algorithms.MergeSortIntegers;
import com.practice.algorithms.QuickSortIntegers;
import com.practice.datastructures.MyHashMap;
import com.practice.fileio.TextfileWriter;
/**
 * This is the main function that executes the examples in this project
 * @author Alex
 * 
 */
public class MainDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Hashmap
		System.out.println("Hashmap Exercise:");
		System.out.println("-----------------");

		MyHashMap hash = new MyHashMap();
		hash.addRandomStudents();

		// Mergesorting
		System.out.println("\n\nMergesort Exercise:");
		System.out.println("-------------------");

		MergeSortIntegers mergeSorter = new MergeSortIntegers();
		int[] unsorted = mergeSorter.generateRandomList(10,100);

		System.out.println("Unsorted List");
		mergeSorter.printList(unsorted);

		System.out.println("Sorted List");
		mergeSorter.printList(mergeSorter.mergeSortIntegers(unsorted));

		// Quicksorting
		System.out.println("\n\nQuicksort Exercise:");
		System.out.println("-------------------");

		QuickSortIntegers quickSorter = new QuickSortIntegers();
		ArrayList<Integer> unsortedList = quickSorter.generateRandomList(10, 50);

		System.out.println("Unsorted List");
		quickSorter.printList(unsortedList);

		System.out.println("Sorted List");
		quickSorter.printList(quickSorter.quickSortIntegers(unsortedList));

		// File I/O
		System.out.println("\n\nFile I/O Exercise:");
		System.out.println("------------------");

		TextfileWriter writeFiles = new TextfileWriter();
		if(writeFiles.startWriting()){
			System.out.println("Files have been written successfully");
		}
		else{
			System.out.println("There has been an error writing the files");
		}

		
		System.out.println("\nDone");
	}

}
