package com.bridgeLabz.testMaximum;

public class TestMaximum {
	public static int findMaxOfThree(Integer a, Integer b, Integer c) {

		Integer max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		return max;
	}
}
