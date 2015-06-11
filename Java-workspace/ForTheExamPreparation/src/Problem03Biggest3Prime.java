import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class Problem03Biggest3Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split("\\W+");
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			int n = Integer.parseInt(numbers[i]);
			if (n>1) {
				for (int j = 2; j < n; j++) {
					if (n % j != 0 ) {
						primeNumbers.add(n);
					}
				}
				
			}
		}
		TreeMap<Integer, Integer> myMap = new TreeMap<Integer , Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer key = primeNumbers.get(i);
			if (myMap.get(key)==null) {
				myMap.put(key, 1);
			}
			else {
				int value = myMap.get(key).intValue();
				value++;
				myMap.put(key, value);
			}
		}
		for (Integer key : myMap.keySet) {

			if (map.get(key) blabla) {

			remove

			}

			}


	}

}
