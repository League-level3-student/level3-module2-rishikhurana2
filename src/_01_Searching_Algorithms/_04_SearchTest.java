package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		String[] randomWords = new String[3];
		randomWords[0] = "hi";
		randomWords[1] = "how";
		randomWords[2] = "hey";
		//1. use the assertEquals method to test your linear search method.
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "hi"), 0);
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "how"), 1);
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "hey"), 2);
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] randomIntegers = new int[101];
		for (int i = 0; i < randomIntegers.length; i++) {
			randomIntegers[i] = i;
		}
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, randomIntegers[0], randomIntegers[100], 50), 50);
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, randomIntegers[10], randomIntegers[90], 50), 50);
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, randomIntegers[20], randomIntegers[60], 40), 40);
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
