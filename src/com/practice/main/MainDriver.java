package com.practice.main;

import java.util.ArrayList;

import com.practice.algorithms.MergeSortIntegers;
import com.practice.algorithms.QuickSortIntegers;
import com.practice.datastructures.MyHashMap;

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

		System.out.println("\nDone");
	}

}
