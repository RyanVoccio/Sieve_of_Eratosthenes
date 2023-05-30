package voccio.assignment4;

import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an int...");
		int maximumInt = input.nextInt();
		
		PrimeCalculator calculator = new PrimeCalculator();
		
		List<Integer> primes = calculator.GetPrimeNumbers(maximumInt);

		System.out.println("The prime numbers are: " + primes);
	}

}
