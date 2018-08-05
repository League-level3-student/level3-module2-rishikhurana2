package _01_Searching_Algorithms;

public class _00_LinearSearch {
	public static void main(String[] args) {
		String[] random = new String[101];
		String temp = "a";
		for (int i = 0; i < 100; i++) {
			random[i] = temp += "a"; 
		}
	}
	// When finding the location of a certain element in an array, 
	// there are many algorithms that can do so. The simplest is the
	// linear search. This is best for short unsorted lists of data.
	public static int linearSearch(String[] words, String value) {
		//1. Complete the method using a for loop to find the value
		//   in the array. Return the location in the array
		//   where the value was found.
		//   If the value is not found in the array, return -1.
		int status = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i] == value) {
				status = i;
			}
			else {
				status = -1;
			}
		}
		return status;
	}
}
