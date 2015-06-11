import java.util.Scanner;


public class Problem07CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = scanner.nextInt();
		
		//this is a method that counts the bits 1 in a number:
		int count = Integer.bitCount(n);
		
		System.out.println("The number of 1 bits are = " + count);
		
		
	}

}
