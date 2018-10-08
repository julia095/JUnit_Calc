package calc;
import calc.Calculator;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


import java.util.Scanner;

import org.junit.Test;

public class CalculatorTest {
	//Test Add function
	@Test
	public void testAdd_positivenumbersgiveResult() {
		
		assertEquals("add error",7,Calculator.add(3, 4),0.1);	
	}
	//Test Substract function
	@Test
	public void testSubstract_positivenumbersgiveResult() {
		assertEquals("substract error",7,Calculator.subtract(10, 3),0.1);	
	}
	
	//Test Multiply function
	@Test
	public void testMultiply() {
		assertEquals("myltiply error",6,Calculator.multyply(3, 2),0.1);	
	}
	
	//@Test
	//public void testDivide() {
	//	assertEquals("divide error",6,Calculator.divide(36, 6),0.1);	
	//}
		
	  	
	//@Test
	 // public void divideByZero_throws_exception() {
	///	try {
    ///        double divideresult = Calculator.divide(5, 0);
//
    //        fail("should throw an exception");
   //     } catch (ArithmeticException e){
   //         assertThat(e.getMessage(), containsString("/ by zero"));
  //          assertThat(e, instanceOf(ArithmeticException.class));
 //   /    }
	//  }      	
    }


