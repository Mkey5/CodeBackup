package eu.IntroJava.jee.problem1;

import java.util.Scanner;

public class TakingInfoFormAPerson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first name: ");
		String fistName = scanner.nextLine();
		
		System.out.println("Please enter middle name: ");
		String middleName = scanner.nextLine();
				
		System.out.println("Please enter last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter age: ");
		int age = scanner.nextInt();
		
		System.out.println("Fist name: "+ fistName);
		System.out.println("Middle name: " + middleName);
		System.out.println("Last name: " + lastName);
		System.out.println("Age : " + age);
		

	}

}
