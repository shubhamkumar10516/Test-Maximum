package com.bridgeLabz.testMaximum;

import java.util.*;

public class TestMaximum {

	// find max among integers
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		return max;
	}

	// extending maximum method
	public static <T extends Comparable<T>> T testMaximum(List<T> list) {
		Collections.sort(list);
		return list.get(list.size() - 1);
	}
}

class Generic<T extends Comparable<T>> {

	T v1, v2, v3;
	List<T> list = new ArrayList<>();

	// constructor
	public Generic() {

	}

	// parameterized constructor
	public Generic(T a, T b, T c) {
		v1 = a;
		v2 = b;
		v3 = c;
	}

	// finding maximum method
	public T testMaximum() {
		return TestMaximum.testMaximum(v1, v2, v3);
	}

	// extended max method uc4
	public T testMaximumExtended(List<T> list) {
		return TestMaximum.testMaximum(list);
	}
}