package com.bridgeLabz.testMaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void findMaxOfThreeTc1() {
		assertEquals(300, TestMaximum.findMaxOfThree(300, 100, 200));
	}
	
	@Test
	public void findMaxOfThreeTc2() {
		assertEquals(700, TestMaximum.findMaxOfThree(400, 700, 200));
	}
	
	@Test
	public void findMaxOfThreeTc3() {
		assertEquals(900, TestMaximum.findMaxOfThree(400, 200, 900));
	}
	
	@Test
	public void findMaxOfThreeTc4() {
		assertTrue(300.56 == TestMaximum.findMaxOfThree(300.56, 100.92, 200.6));
	}
	
	@Test
	public void findMaxOfThreeTc5() {
		assertTrue(700.36 == TestMaximum.findMaxOfThree(400.98, 700.36, 200.99));
	}
	
	@Test
	public void findMaxOfThreeTc6() {
		assertTrue(900.23 == TestMaximum.findMaxOfThree(400.5, 200.8, 900.23));
	}
}
