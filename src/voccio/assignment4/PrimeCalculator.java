package voccio.assignment4;

import java.util.List;
import java.util.ArrayList;

public class PrimeCalculator {

	public PrimeCalculator() {
	}
	
	public List<Integer> GetPrimeNumbers(int value)
	{
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 2; i < value +1 ; i++)
		{
			boolean isPrime = true;
			for (int j = 2; j < value; j++)
			{
				if (i != j && i % j == 0)
				{
					isPrime = false;
				}
			}
			
			if (isPrime)
			{
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

}
