package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) 
	{
		int n = 81;
		double sqrt = Math.sqrt(n);
	
		for (int i = 2; i <= sqrt; i++) 
		{
			if (n % i == 0) 
			{
				System.out.println("The number " + n + " is not a prime number!");
				return;
			}
		}
		System.out.println("The number " + n + " is prime number!");
	}

}
