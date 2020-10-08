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
}
