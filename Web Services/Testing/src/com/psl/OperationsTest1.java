package com.psl;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationsTest1 {
	ArrayList<Integer> list;
	
	@BeforeClass		
    public static void m1() {
        System.out.println("Started Test Cases of OperationsTest1");
    }
	@AfterClass		
    public static void m3() {							
        System.out.println("Finished Test Cases of OperationsTest1");					
    }
	@Before
    public void m2() {					
        list = new ArrayList<Integer>();					
        //System.out.println("@Before: ");					
    }	
    @After		
    public void m4() {					
        list.clear();			
        //System.out.println("@After: ");					
    }

    @Test(timeout=100)
    public void testSumOfListListOfInteger() {
		Operations obj = new Operations();

		assertEquals("Test Passed for 0 elements", 0, obj.sumOfList(list));
		list.add(10);
		assertEquals("Test Passed for 1 element", 10, obj.sumOfList(list));
		list.add(20);
		assertEquals("Test Passed for 2 elements", 30, obj.sumOfList(list));
	}

	//@Test(expected = NoSuchMethodException.class)
	@Test
	public void testProductOfListListOfInteger() {
		Operations obj = new Operations();

		assertEquals("Test Passed for 0 elements", 1, obj.productOfList(list));
		list.add(10);
		assertEquals("Test Passed for 1 element", 10, obj.productOfList(list));
		list.add(20);
		assertEquals("Test Passed for 2 elements", 200, obj.productOfList(list));
	}

}
