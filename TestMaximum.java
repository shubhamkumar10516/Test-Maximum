package com.bridgeLabz.testMaximum;

public class TestMaximum {
	//find max among integers
	public static int findMaxOfThree(Integer a, Integer b, Integer c) {

		Integer max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		return max;
	}
	
	//find max among integers
	public static double findMaxOfThree(Double a, Double b, Double c) {

		Double max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		return max;
	}
}
