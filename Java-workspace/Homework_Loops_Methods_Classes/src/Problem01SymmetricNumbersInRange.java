import java.util.Scanner;


public class Problem01SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
	
		for (int i = start ; i < end; i++) {
			int hundreds = i / 100;
			int tens = i/10 % 10;
			int units = i%10;
			
			if (i>0 && i<10) {
				System.out.print(i+ " ");
			}
			else if (i%11 == 0 && i<99 ) {
				System.out.print(i + " ");
			}
			else if (hundreds == units || (hundreds==tens && hundreds==units)) {
				System.out.print(i + " ");
			}
		
		}
	}

}
