import java.util.Scanner;


public class Problem01Eggs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int eggsCount = 0;
		
		for (int i = 0; i < 7; i++) {
			int eggs = scanner.nextInt();
			String units = scanner.next();
			
			if (units.equals("dozen") || units.equalsIgnoreCase("dozens")) {
				eggs*=12;
				eggsCount+=eggs;
			}
			else {
				eggsCount += eggs;
			}
		}
		int dozens = eggsCount/12;
		int eggsLeft = eggsCount%12;
		if (eggsLeft>0) {
			System.out.printf("%d dozens + %d eggs",dozens,eggsLeft);
		}
		else {
			System.out.printf("%d dozens + 0 eggs",dozens);
		}

	}

}
