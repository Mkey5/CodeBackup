package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class TwoWholeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two whole numbers.Enter the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the secound number: ");
		int secoundNumber = scanner.nextInt();
		
		if (firstNumber > secoundNumber) {
			int m = firstNumber;
			firstNumber = secoundNumber;
			secoundNumber = m;
			System.out.printf("Fist number is bigger than the secound, so first number = %d ,"
					+ " secound number = %d",firstNumber,secoundNumber);
		}
		else {
			System.out.printf("First number isn't bigger than the secound one , so fisrt nnumber = %d ,"
					+ "secound number = %d",firstNumber , secoundNumber);
		}

	}

}
