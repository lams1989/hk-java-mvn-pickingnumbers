package com.lams1989.pickingnumbers;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class PickingNumbersTest extends TestCase {

	public void TestcountNumbers() {
		List<Integer> a = Arrays.asList(1,1,2,2,4,4,5,5,5);
		int result = PickingNumbers.countNumbers(a);
		assertEquals(5, result);

	}
	
	public void TestcountNumbers1() {
		List<Integer> b = Arrays.asList(4, 6, 5, 3, 3, 1);
		int result = PickingNumbers.countNumbers(b);
		assertEquals(3, result);

	}
	
	public void TestcountNumbers2() {
		List<Integer> c = Arrays.asList(1, 2, 2, 3, 1, 2);
		int result = PickingNumbers.countNumbers(c);
		assertEquals(5, result);

	}
	
	
}
