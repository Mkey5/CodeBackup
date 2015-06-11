import java.util.Scanner;

//Write a program to find how many times given string appears in given
//text as substring. The text is given at the first input line.
//The search string is given at the second input line.
//The output is an integer number. Please ignore the character casing.

public class Problem07CountSubstringOccurrences {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		String subString = scanner.nextLine().toLowerCase();
		
		String helpingMe = text.substring(0, 2); //THIS IS ONLY FOR ME , this is how u can take and make a new string from parts
		System.out.println(helpingMe);			 //of a string ;) 
//		System.out.println(text.length());
//		System.out.println(subString.length());
		
		int count = 0;
		for(int i = 0;i <= text.length() - subString.length();i++){
			if(text.substring(i,subString.length() + i).equals(subString)){ //with .substring 
				count++;
			}
		}
		System.out.print(count);
		
	}
}
//Examples:
//Input												Output
//Welcome to the Software University (SoftUni)!		4
//Welcome to programming. Programming is wellness
//for developers, said Maxwell.
//wel

//aaaaaa											5
//aa