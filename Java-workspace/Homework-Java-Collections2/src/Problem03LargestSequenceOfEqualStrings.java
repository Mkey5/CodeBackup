import java.util.Scanner;


//Write a program that enters an array of strings and finds in it
//the largest sequence of equal elements.
//If several sequences have the same longest length,
//print the leftmost of them.
//The input strings are given as a single line, separated by a space.

public class Problem03LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] splitStr = scanner.nextLine().split(" ");
		
		int counter = 1;
		int maxCounter = 1;
		int index = 0;
		for(int i = 1;i < splitStr.length;i++){
			if(splitStr[i].equals(splitStr[i-1])){
				counter++;
			}else{
				counter = 1;
			}
			
			if(counter > maxCounter){			// with this we look for the biggest sequence ;) and on which index starts the sequence
				maxCounter = counter;
				index = i;
			}
		}
		
		for(int i = 0;i < maxCounter;i++){			// this part just print the sequence by printing the string  maxCounter-times = the length of the sequence ;) 
			System.out.print(splitStr[index] + " ");
		}
	}

}
//Examples:
//Input						Output
//hi yes yes yes bye		yes yes yes

//SoftUni softUni softuni	SoftUni

//1 1 2 2 3 3 4 4 5 5		1 1

//a b b xxx c c c			c c c

//hi hi hi hi hi			hi hi hi hi hi

//hello						hello

//import java.util.Scanner;
//
//
//public class Problem03LargestSequenceOfEqualStrings {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		String[] arrayOfStrings = scanner.nextLine().split(" ");
//				
//		int tempCount = 1;
//		int count = Integer.MIN_VALUE;
//		int endIndex = 0;
//		int tempEndIndex = 0;
//		
//		for (int i = 0; i < arrayOfStrings.length - 1; i++) {
//			if (arrayOfStrings[i].equals(arrayOfStrings[i + 1])) {
//				tempCount++;
//				tempEndIndex = i + 1;
//				if (i == arrayOfStrings.length - 2) {
//					if (tempCount > count) {
//						count = tempCount;
//						endIndex = tempEndIndex;
//					}
//				}
//			} else {
//				if (tempCount > count) {
//					count = tempCount;
//					endIndex = tempEndIndex;
//				}
//				tempCount = 1;
//			}
//		}
//		
//		if (arrayOfStrings.length != 1) {
//			int startIndex = endIndex - count + 1;
//			for (int i = startIndex; i <= endIndex; i++) {
//				System.out.print(arrayOfStrings[i] + " ");
//			}
//		} else {
//			System.out.println(arrayOfStrings[0]);
//		}
//
//	}
//
//}