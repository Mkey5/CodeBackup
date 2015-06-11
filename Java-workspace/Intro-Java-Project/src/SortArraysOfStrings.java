import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArraysOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of towns you want ot sort = ");
		int numberOfTowns = scanner.nextInt();
		String[] towns = new String[numberOfTowns];
		for (int i = 0; i < towns.length; i++) {
			
			towns[i] = scanner.nextLine();
			//System.out.println("Enter town name: ");
		}
		Arrays.sort(towns);
		
		System.out.println("Here are the sorted towns names: ");
		for (int i = 0; i < towns.length; i++) {
			System.out.println(towns[i]);
		}

	}

}
