package _00_Sorting_Algorithms;

import java.util.ArrayList;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean intArraySorted(ArrayList<Integer> integers) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < integers.size() - 1; i++) {
				if (integers.get(i) > integers.get(i + 1)) {
					int temp = integers.get(i);
					integers.set(i, integers.get(i + 1));
					integers.set(i + 1, temp);
					swap = true;
				}
			}
		}
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}
		return true;
	}
	static boolean doubleArraySorted(ArrayList<Double> doubles) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < doubles.size() - 1; i++) {
				if (doubles.get(i) > doubles.get(i + 1)) {
					double temp = doubles.get(i);
					doubles.set(i, doubles.get(i + 1));
					doubles.set(i + 1, temp);
					swap = true;
				}
			}
		}
		return true;
	}
	static boolean charArraySorted(ArrayList<Character> characters) {
		
		return false;
		
	}
}
