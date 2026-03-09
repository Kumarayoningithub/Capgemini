package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();	
	@Test
	void testcomputeSquareArea() {
		//fail("Not yet implemented");
		
		assertEquals(576, shape.computeSquareArea(24));
	}
	
	@Test
	void testcomputeCircleArea() {
		
		
		assertEquals(78.5, shape.computeCircleArea(5), "Area of circle calculation is wrong");
	}
	

}
