import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem03 {

	public static void main(String[] args) {
//		2
//		1 1 1 1 1 1
//		2 1 1 3
//		1 1
//		2 2 2 3
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		ArrayList<ArrayList<Integer>> firstArr = new ArrayList<>();
		ArrayList<ArrayList<Integer>> secondArr = new ArrayList<>();
		
//		for adding in the first "block"
		
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().trim().split("\\s+");
			firstArr.add(new ArrayList<Integer>());
			for (int j = 0; j < line.length; j++) {
				firstArr.get(i).add(Integer.parseInt(line[j]));
			}
		}
		
//		for adding in the second "block"
		
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().trim().split("\\s+");
			secondArr.add(new ArrayList<Integer>());
			for (int j = 0; j < line.length; j++) {
				secondArr.get(i).add(Integer.parseInt(line[j]));
			}
		}
		
//		reversing the secondArr and adding it to the firstArr
		
		for (int i = 0; i < n; i++) {
			Collections.reverse(secondArr.get(i));
			firstArr.get(i).addAll(secondArr.get(i));
		}

//		checking if the two make a block "rectangular"		
		boolean isRectangular = false;
		int sizeToCheck = firstArr.get(0).size();
		for (int i = 1; i < n; i++) {
			if(sizeToCheck == firstArr.get(i).size()){
				isRectangular = true;
			}else{
				isRectangular = false;
				break;
			}
		}
		
//		printing result
		
		if(isRectangular){
			for (ArrayList<Integer> nums : firstArr) {
				System.out.println(nums);
			}
		}else{
			int count = 0;
			for (ArrayList<Integer> nums : firstArr) {
				count+= nums.size();
			}
			System.out.printf("The total number of cells is: %d",count);
		}
		

	}

}
