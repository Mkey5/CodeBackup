package eu.IntroJava.jee.problem1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormattingResultsAndDate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter side a: ");
		double a = scanner.nextDouble();
		System.out.println("Please enter side b: ");
		double b = scanner.nextDouble();
		
		double area = a*b;
		double perimeter = (2*a)+(2*b);
		System.out.println("The area of the rectangle is = " + area);
		System.out.println("The perimeter of the rectangle is = " + perimeter);
		
		// This is for formatting a result /2.5 --> 2.500/ :
		System.out.printf("formatted area = %.2f\n", area);
		System.out.printf("formatted perimeter = %.2f\n",perimeter);
		
		//This is for formatting a result by outlining it:
		//But this works only with int(%d) or string(%s):
		//So if the "result" is 5 symboled and you (%6s) it will pad the text only
		//by 1 symbol !
		System.out.printf("outlined result: %5d\n",12);
		System.out.printf("otlined result: %10d\n",12);
		
		//This is for formatting the Date:
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(df.format(d));
		
		//Formatting a String to hold a variable:
		String out = String.format("My formatted area = %.2f",area);
		System.out.println(out);
		//You can make a String which can hold more than 1 formatted result, but 
		//it will become 1 whole String:
		String out2 = String.format("My formatted area = %.2f\nMy formatted perimeter = %.2f\n",area,perimeter);
		System.out.println(out2);
		

	}

}
