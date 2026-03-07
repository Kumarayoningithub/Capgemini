package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrays {

	@Test
	void testArrays() {
		 int [] expected = {2,4,6,8};
		 int [] actual = {2,4,6,8};
		 
		 assertArrayEquals(expected, actual);
           
	}

}
