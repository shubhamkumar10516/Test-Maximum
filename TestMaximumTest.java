package com.bridgeLabz.testMaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void testMaximumTc1() {
		assertTrue(300 == TestMaximum.testMaximum(300, 100, 200));
	}
	
	@Test
	public void testMaximumTc2() {
		assertTrue(700 == TestMaximum.testMaximum(400, 700, 200));
	}
	
	@Test
	public void testMaximumTc3() {
		assertTrue(900 == TestMaximum.testMaximum(400, 200, 900));
	}
	
	@Test
	public void testMaximumTc4() {
		assertTrue(300.56 == TestMaximum.testMaximum(300.56, 100.92, 200.6));
	}
	
	@Test
	public void testMaximumTc5() {
		assertTrue(700.36 == TestMaximum.testMaximum(400.98, 700.36, 200.99));
	}
	
	@Test
	public void testMaximumTc6() {
		assertTrue(900.23 == TestMaximum.testMaximum(400.5, 200.8, 900.23));
	}
	
	@Test
	public void testMaximumTc7() {
		assertTrue("peach".equals(TestMaximum.testMaximum("apple", "peach", "banana")));
	}
	
	@Test
	public void testMaximumTc8() {
		assertTrue("peach".equals(TestMaximum.testMaximum("peach", "apple", "banana")));
	}
	
	@Test
	public void testMaximumTc9() {
		assertTrue("peach".equals(TestMaximum.testMaximum("peach", "banana", "apple")));
	}
	
	@Test
	public void testMaximumTc10() {
		Generic<Integer> gnObj = new Generic<Integer>(4,3,1);
		assertTrue(4 == (gnObj.testMaximum()));
	}
	
	@Test
	public void testMaximumTc11() {
		Generic<Double> gnObj = new Generic<Double>(4.1,4.3,1.9);
		assertTrue(4.3 == (gnObj.testMaximum()));
	}
	
	@Test
	public void testMaximumTc12() {
		Generic<String> gnObj = new Generic<String>("apple","banana","pear");
		assertTrue("pear".equals(gnObj.testMaximum()));
	}
}
