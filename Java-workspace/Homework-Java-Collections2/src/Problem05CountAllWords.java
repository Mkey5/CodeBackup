import java.util.Scanner;

//Write a program to count the number of words in given sentence.
//Use any non-letter character as word separator.

public class Problem05CountAllWords {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		String[] text = scanner.nextLine().split("\\W+"); //this splits by removing any punctuation marks
		
		System.out.print(text.length);	
		}
	}
//Examples:
//Input													Output
//Welcome to the Software University (SoftUni)!			6

//I am coming...										3

//It's OK, I'm in.										6