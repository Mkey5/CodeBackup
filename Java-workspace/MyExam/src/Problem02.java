import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alphaUp = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "Y", "Z" };
		String[] alphaLow = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" };
		String[] input = scanner.nextLine().split("\\W+");
//		CharSequence cs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		CharSequence cs2 = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<String> wordsHelper = new ArrayList<String>();

		double forCalc = 0;

		for (int i = 0; i < input.length; i++) {		//with this for we take only 1 word
			String word = input[i];
			double n = Integer.parseInt(word.substring(1,
					word.length() - 1));
			
			for (int j = 0; j < alphaUp.length; j++) {	//with this we check if the first is A
				if (word.substring(0, 1).equals(alphaUp[j])) {
					//String helper = word.substring(0,1);
					
					n/= (j + 1); // if A , so we /
				}
			}
			
			for (int j = 0; j < alphaLow.length; j++) {		//with this for we check if the first is a
				if (word.substring(0, 1).equals(alphaLow[j])) {	
					
					n*= (j + 1); // if a , so we *
					
				}
			}
			
			for (int j = 0; j < alphaUp.length; j++) {	//with this for we check if the last is A
				if (word.substring(word.length()-1, word.length()).equals(alphaUp[j])) {	
					
					n-=(j + 1); // if A , so we -
				}
			}
			
			for (int j = 0; j < alphaLow.length; j++) {	//with this for we check if the last is a
				if (word.substring(word.length()-1, word.length()).equals(alphaLow[j])) {	
					
					n+=(j + 1); // if A , so we +
				}
			}
			forCalc+=n;

		}

		System.out.printf("%.2f",forCalc);

	}

}
