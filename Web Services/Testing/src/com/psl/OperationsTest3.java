package com.psl;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OperationsTest3 {
	private ArrayList<Integer> inputList;
	private int input;
	private ArrayList<Integer> resultList;
	private Operations operation;
	
	public OperationsTest3(ArrayList<Integer> inputList, int input, ArrayList<Integer> resultList) {
		super();
		this.inputList = inputList;
		this.input = input;
		this.resultList = resultList;
	}
	
	@BeforeClass		
    public static void m1() {
		System.out.println("Started Test Cases of OperationsTest3");
    }
	@AfterClass		
    public static void m3() {							
        System.out.println("Finished Test Cases of OperationsTest3");					
    }
	@Before
    public void m2() {					
		operation = new Operations();
        //System.out.println("@Before: ");					
    }	
	@Parameterized.Parameters
	public static Collection input(){
		return Arrays.asList(new Object[][]{
				{new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10})), 3, new ArrayList<Integer>(Arrays.asList(new Integer[]{3,6,9}))},
				{new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10})), 7, new ArrayList<Integer>(Arrays.asList(new Integer[]{7}))}
				});
	}
	
	@Test
    public void testMultiplesOf() {
		assertEquals("Test Passed for MultiplesOf()", resultList, operation.multiplesOf(inputList, input));
	}
	@Test
    public void testDivisibleBy() {
		assertEquals("Test Passed for DivisibleBy()", resultList, operation.divisibleBy(inputList, input));
	}
}
