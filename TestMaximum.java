package com.bridgeLabz.testMaximum;

public class TestMaximum {
	
	// find max among integers
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c, T... d) {
		T max = a;
		max = b.compareTo(max) > 0 ? b : max;
		max = c.compareTo(max) > 0 ? c : max;
		for (T val : d)
			max = val.compareTo(max) > 0 ? val : max;
		return max;
	}

        class Generic<T extends Comparable<T>> {

	        T v1, v2, v3;
    //parameterized constructor
	        public Generic(T a, T b, T c) {
		        v1 = a;
		        v2 = b;
		        v3 = c;
	}
    //finding maximum method
	        public T testMaximum() {
		        return TestMaximum.testMaximum(v1, v2, v3);
	        }
        }
}
