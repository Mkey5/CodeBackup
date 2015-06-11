import java.util.Scanner;


public class Problem08CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number n : ");
		
		int n = scanner.nextInt();
		int semiNumber = n >> 1;
		int count = 0;
		
		while (semiNumber != 0) {
			int numberBit = 1 & n;
			int semiNumberBit = 1 & semiNumber;
			if (numberBit == semiNumberBit) {
				count++;
			}
		
			semiNumber = semiNumber >> 1;
			n = n >> 1;
		}
		
		System.out.println(count);

	}

}
