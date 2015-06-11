package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class PlayingWithScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number a :");
		int a = scanner.nextInt();
		System.out.println("Enter number b :");
		int b = scanner.nextInt();
		
		System.out.println("The sum of a and b = " + (a+b));
		System.out.println("The number a is : " + ( a % 2 == 0? "even!" : "odd!"));
		System.out.println("The nnumber b is : " + ( b % 2 == 0? "even!" : "odd!"));
		

	}

}
