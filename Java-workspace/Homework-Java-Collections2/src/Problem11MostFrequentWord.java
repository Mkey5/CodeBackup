import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Write a program to find the most frequent word in a text and print it,
//as well as how many times it appears in format "word -> count".
//Consider any non-letter character as a word separator.
//Ignore the character casing. If several words have the same maximal
//frequency, print all of them in alphabetical order.

public class Problem11MostFrequentWord {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String[] text = scanner.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> wordsCount = new TreeMap<>();
		
		for (String word : text) {
			  Integer count = wordsCount.get(word);	//
			  if (count == null) {					//this checks if the specific word is = to another word in the. If it it's not. The count = null and so on . . .
			    count = 0; 
			  }
			  wordsCount.put(word, count+1);
		}
		
		int maxCount = 0;
		for (Object value : wordsCount.values()) {	//this goes through the values stored in wordsCount
			if (maxCount < (Integer)value) {		//with this we check for the biggest value (in=1 , of=1 , the=2
				maxCount = (Integer)value;			//with this we take the result so that we can use it
			}
		}
		
		for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
			if (entry.getValue() == maxCount) {									//with this we search for the most frequent word
				System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
			}
		}
	}
}
//Examples:
//Input										Output
//in the middle of the night				the -> 2 times

//Welcome to SoftUni. Welcome to Java.
//Welcome everyone.							welcome -> 3 times