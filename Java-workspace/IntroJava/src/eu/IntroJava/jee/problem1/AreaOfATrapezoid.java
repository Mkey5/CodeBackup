package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class AreaOfATrapezoid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double h = 0;
		
		System.out.println("Please enter side a :");
		a = scanner.nextDouble();
		System.out.println("Please enter side b :");
		b = scanner.nextDouble();
		System.out.println("Please enter h :");
		h = scanner.nextDouble();
		
		double s = ((a+b)/2) * h;
		
		System.out.println("The area of the trapezoid is : " + s);
		

	}

}
