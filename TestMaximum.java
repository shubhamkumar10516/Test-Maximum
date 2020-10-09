package com.bridgeLabz.testMaximum;

public class TestMaximum {
	
	// find max among integers
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		return max;
	}
}
