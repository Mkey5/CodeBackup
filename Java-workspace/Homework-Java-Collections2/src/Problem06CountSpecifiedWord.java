import java.util.Scanner;

//Write a program to find how many times a word appears in given text.
//The text is given at the first input line. The target word is given
//at the second input line. The output is an integer number.
//Please ignore the character casing. Consider that any non-letter
//character is a word separator. 

public class Problem06CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//equate the two strings to the same font
		String inputText = scanner.nextLine().toUpperCase();
		String[] text = inputText.split("\\W+") ;				// removes everything that's not a word ;)
		String target = scanner.nextLine().toUpperCase();
		
		int count = 0;
		for(int i = 0;i < text.length;i++){
			if(target.equals(text[i])){
				count++;
			}
		}
		System.out.print(count);
	}
}
//Examples:
//Input												Output
//Welcome to the Software University (SoftUni)!		2
//Welcome to programming.
//welcome