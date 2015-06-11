package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = 0;
		do {
			System.out.println("Enter number n between 0-9 : ");
			int n = scanner.nextInt();
			m=n;
			
			if (n>=0 && n<=9) {
				
				switch (n) {
				case 0:System.out.println("Zero!");break;
				case 1:System.out.println("One!");break;
				case 2:System.out.println("Two!");break;
				case 3:System.out.println("Three!");break;
				case 4:System.out.println("Four!");break;
				case 5:System.out.println("Five!");break;
				case 6:System.out.println("Six!");break;
				case 7:System.out.println("Seven!");break;
				case 8:System.out.println("Eight!");break;
				case 9:System.out.println("Nine!");break;
				default:System.err.println("Please enter a valid number!");
					break;	
				}
				
			}
			else {
				System.err.println("Invalid entry!");
				
			}
		} while (m<0 || m>9);

	}

}
