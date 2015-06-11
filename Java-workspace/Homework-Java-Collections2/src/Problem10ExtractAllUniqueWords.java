import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//At the first line at the console you are given a piece of text.
//Extract all words from it and print them in alphabetical order.
//Consider each non-letter character as word separator.
//Take the repeating words only once. Ignore the character casing.
//Print the result words in a single line, separated by spaces.

public class Problem10ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		String[] textArr = text.split("\\W");
		Arrays.sort(textArr);
		
		ArrayList<String> extractText = new ArrayList<String>();
		for(int i = 0;i < textArr.length;i++){
			extractText.add(textArr[i]);
		}
		extractText.remove(0);								//this is for removing the 0 empty entry , don't know why it is even there :D
		//extractText.stream().forEach(x -> System.out.print(x + " "));
		for (String string : extractText) {
			System.out.print(string+ " ");
		}
	}
}
//Examples:
//Input									Output
//Welcome to SoftUni. Welcome to Java.	java softuni to welcome

//What is better: Java SE or Java EE?	better åå is java or se what

//hello									hello