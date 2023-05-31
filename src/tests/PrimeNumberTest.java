package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import voccio.assignment4.PrimeCalculator;

public class PrimeNumberTest {

	@Test
	public void test() {
		//fail("Not yet implemented");

        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
        
        PrimeCalculator calculator = new PrimeCalculator();
		
		List<Integer> primes = calculator.GetPrimeNumbers(10);
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(5);
		expectedList.add(7);
		assertEquals(primes, expectedList);
	}

}
