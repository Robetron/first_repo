package com.psl;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class OperationsTest2 {
	@Rule		
    public ErrorCollector collector = new ErrorCollector();
	
	@BeforeClass		
    public static void m1() {
        System.out.println("Started Test Cases of OperationsTest2");
    }
	@AfterClass		
    public static void m3() {							
        System.out.println("Finished Test Cases of OperationsTest2");
    }
	@Before
    public void m2() {					
        //System.out.println("@Before: ");					
    }	
    @After		
    public void m4() {					
        //System.out.println("@After: ");					
    }

    @Test
    public void testIsOdd() {
		Operations obj = new Operations();
		try {			
			assertTrue("Test Passed for even element", obj.isOdd(3));
			assertFalse("Test Passed for odd elements", obj.isOdd(4));		
			//assertFalse("Test Passed for even element", obj.isOdd(3));
			//assertTrue("Test Passed for odd elements", obj.isOdd(4));		
        } catch (Throwable t) {					
            collector.addError(t);					
        }
	}

    @Test
    public void testIsEven() {
		Operations obj = new Operations();
		try{
			assertTrue("Test Passed for odd elements", obj.isEven(2));
			assertFalse("Test Passed for even element", obj.isEven(3));
			//assertFalse("Test Passed for even element", obj.isEven(2));
			//assertTrue("Test Passed for odd elements", obj.isEven(3));
		}catch (Throwable t) {					
            collector.addError(t);					
        }
	}
}
