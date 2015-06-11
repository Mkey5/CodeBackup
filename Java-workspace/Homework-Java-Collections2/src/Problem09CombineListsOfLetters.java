import java.util.ArrayList;
import java.util.Scanner;

//Write a program that reads two lists of letters l1 and l2 and combines
//them: appends all letters c from l2 to the end of l1, but only when
//c does not appear in l1. Print the obtained combined list.
//All lists are given as sequence of letters separated by a single space,
//each at a separate line. Use ArrayList<Character> of chars to keep the
//input and output lists.

public class Problem09CombineListsOfLetters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] basicÒext = scanner.nextLine().replace(" ", "").toCharArray(); // removing
																				// " "
																				// spaces
		char[] additionalText = scanner.nextLine().replace(" ", "")
				.toCharArray(); // removing " " spaces

		ArrayList<Character> basicList = new ArrayList<>();
		ArrayList<Character> additionalList = new ArrayList<>();
		for (Character letter : basicÒext) { // adding to list
			basicList.add(letter);
			additionalList.add(letter);
		}

		for (Character letter : additionalText) { // checking for matches and
													// building the new word
			if (!additionalList.contains(letter)) {
				basicList.add(letter);
			}
		}
		for (Character letter : basicList) { // printing
			System.out.print(letter + " ");
		}
	}
}
// Examples:
// Input Output
// h e l l o
// l o w h e l l o w

// a b c d
// x y z a b c d x y z

// a b a
// b a b a a b a

// w e l c o m e t o s o f t u n i
// j a v a p r o g r a m m i n g w e l c o m e t o s o f
// t u n i j a v a p r g r a g