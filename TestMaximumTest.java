package com.bridgeLabz.testMaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void findMaxOfThreeTc1() {
		assertTrue(300 == TestMaximum.findMaxOfThree(300, 100, 200));
	}
	
	@Test
	public void findMaxOfThreeTc2() {
		assertTrue(700 == TestMaximum.findMaxOfThree(400, 700, 200));
	}
	
	@Test
	public void findMaxOfThreeTc3() {
		assertTrue(900 == TestMaximum.findMaxOfThree(400, 200, 900));
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
	
	@Test
	public void findMaxOfThreeTc7() {
		assertTrue("apcd".equals(TestMaximum.findMaxOfThree("apcd", "acdf", "adfe")));
	}
	
	@Test
	public void findMaxOfThreeTc8() {
		assertTrue("almn".equals(TestMaximum.findMaxOfThree("afde", "almn", "ajkl")));
	}
	
	@Test
	public void findMaxOfThreeTc9() {
		assertTrue("ravan".equals(TestMaximum.findMaxOfThree("ram", "ramayan", "ravan")));
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
