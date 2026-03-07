package com.telusko.learning;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArray_Exception() {
		
		SortingArray array = new SortingArray();
		
		int unsorted[]= {2,1,4};
		int[] sortedArray = array.sortingArray(unsorted);
		
		for(int ele: sortedArray) {
			System.out.print(ele);
		}
		
	}

}
