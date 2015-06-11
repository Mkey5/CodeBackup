import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import org.apache.commons.lang.time.StopWatch;

public class SortingPseudocode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] numbers = scan.nextLine().replace("[", "").replace("]", "")
				.split(", ");
		ArrayList<Integer> numbersArr = new ArrayList<Integer>();

		// TODO: Parse the numbers and add them to the list
		

		for (int i = 0; i < numbers.length; i++) {
			int a = Integer.parseInt(numbers[i]);
			numbersArr.add(a);
		}

		// StopWatch stopWatch = new StopWatch();
		// stopWatch.start();

		// TODO: Write the sorting algorithm that you use for sorting the List's
		// elements

		boolean swaped = false;
		do {
			swaped = false;
			for (int i = 0; i < (numbersArr.size()-1); i++) {
				if (numbersArr.get(i) >= numbersArr.get(i + 1)) {
					int temp = numbersArr.get(i + 1);
					numbersArr.set(i + 1, numbersArr.get(i));
					numbersArr.set(i, temp);
					swaped = true;
				}
			}
		} while (swaped);

		// stopWatch.stop();
		// long time = stopWatch.getTime();

		System.out.println(numbersArr);
		// System.out.println(time/1000.0);
	}
}