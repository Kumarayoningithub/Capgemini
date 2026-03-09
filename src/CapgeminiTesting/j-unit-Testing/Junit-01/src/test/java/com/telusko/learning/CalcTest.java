package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//System.out.println("first junit run");
		// object create
		
		Calc c = new Calc();
		int actual = c.divide(10, 5);
		int expected = 2;
		assertEquals(expected,actual);
	}

}
