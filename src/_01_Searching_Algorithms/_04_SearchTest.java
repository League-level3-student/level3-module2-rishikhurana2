package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	void testLinearSearch() {
		String[] randomWords = new String[3];
		randomWords[0] = "hi";
		randomWords[1] = "how";
		randomWords[2] = "hey";
		// 1. use the assertEquals method to test your linear search method.
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "hi"), 0);
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "how"), 1);
		assertEquals(_00_LinearSearch.linearSearch(randomWords, "hey"), 2);
	}

	@Test
	void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] randomIntegers = new int[101];
		for (int i = 0; i < randomIntegers.length; i++) {
			randomIntegers[i] = i;
		}
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, 0, 100, 20), 20);
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, 50, 70, 55), 55);
		assertEquals(_01_BinarySearch.binarySearch(randomIntegers, 20, 80, 30), 30);
	}

	@Test
	void InterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] sortedInts = new int[10];
		for (int i = 0; i < sortedInts.length; i++) {
			sortedInts[i] = 5 * i;
		}
		assertEquals(_02_InterpolationSearch.interpolationSearch(sortedInts, 10), 2);
		assertEquals(_02_InterpolationSearch.interpolationSearch(sortedInts, 15), 3);
		assertEquals(_02_InterpolationSearch.interpolationSearch(sortedInts, 25), 5);
	}

	@Test
	void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] exponentialInts = new int[101];
		for (int i = 0; i < exponentialInts.length; i++) {
			exponentialInts[i] = i * i;
		}
		assertEquals(_03_ExponentialSearch.exponentialSearch(exponentialInts, 4), 2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(exponentialInts, 9), 3);
		assertEquals(_03_ExponentialSearch.exponentialSearch(exponentialInts, 16), 4);
	}
}
