package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class Check3Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number a: ");
		double a = scanner.nextDouble();
		System.out.println("Please enter the number b: ");
		double b = scanner.nextDouble();
		System.out.println("Please enter the number c: ");
		double c = scanner.nextDouble();
		
		if (a>b && a>c) {
			System.out.println("The number a is the biggest = " +a);
		}
		else if (b>a && b>c) {
			System.out.println("The number b is the biggest = " +b);
		}
		else if (c>a && c>b) {
			System.out.println("The number c is the biggest = "+c);
		}

	}

}
