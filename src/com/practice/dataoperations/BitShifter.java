/**
 * 
 */
package com.practice.dataoperations;

/**
 * A simple excercise in bit shifting
 * @author Alex
 *
 */
public class BitShifter {
	public BitShifter(){
	}

	public void startExercise() {
		int number = 8;
		
		number = number << 1; // Shift the 8 one over to the left to become 16
		System.out.println(number);
		
		number = number >> 2; // Shift the 8 two over to the right to become 4
		System.out.println(number);

		number = ~number ; // invert all bits of the 4= 000...0100 -> 1111111...011 = -5
		System.out.println(number);
		
		number  = 16;
		number = number >>> 1; // unsigned shift
		System.out.println(number);

	}
}
