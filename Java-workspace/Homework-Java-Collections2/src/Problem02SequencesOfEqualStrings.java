import java.util.Scanner;

//Write a program that enters an array of strings and finds in it
//all sequences of equal elements.
//The input strings are given as a single line, separated by a space.

public class Problem02SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] sequenceArr = scanner.nextLine().split(" ");
		
		for(int i = 0;i < sequenceArr.length - 1;i++){
			if(sequenceArr[i].equals(sequenceArr[i+1])){
				System.out.print(sequenceArr[i] + " ");
			}else{
				System.out.println(sequenceArr[i]);
			}
		}
		if(sequenceArr[sequenceArr.length-2].equals(sequenceArr[sequenceArr.length-1])){  //this part is for checking the last string ;)
			System.out.print(sequenceArr[sequenceArr.length-1]);
		}else{
			System.out.println(sequenceArr[sequenceArr.length-1]);
		}
	}
}

//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class Problem02SequencesOfEqualStrings {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		String[] arrayOfStrings = scanner.nextLine().split(" ");
//		ArrayList<String> results = new ArrayList<String>();
//		results.add(arrayOfStrings[0]);
//		
//		if (arrayOfStrings.length == 1) {
//			System.out.println(arrayOfStrings[0]);
//		}
//		
//		for (int i = 0; i < arrayOfStrings.length - 1; i++) {
//			if (arrayOfStrings[i].equals(arrayOfStrings[i + 1])) {
//				results.add(arrayOfStrings[i + 1]);
//				if (i == arrayOfStrings.length - 2) {
//					printSequence(results);					
//				}
//			} else {
//				printSequence(results);
//				System.out.println();
//				results.clear();
//				results.add(arrayOfStrings[i + 1]);
//				if (i == arrayOfStrings.length - 2) {
//					printSequence(results);					
//				}
//			}
//		}
//
//	}
//
//	public static void printSequence(ArrayList<String> results) {
//		for (String result : results) {
//			System.out.print(result + " ");
//		}
//	}
//
//}