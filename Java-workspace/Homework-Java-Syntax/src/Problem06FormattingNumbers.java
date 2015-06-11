import java.util.Scanner;


public class Problem06FormattingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers a , b and c:");
		System.out.println("Enter integer a: ");
		int a = scanner.nextInt();
		System.out.println("Enter floating point b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter foating pointc: ");
		double c = scanner.nextDouble();
		
		String hexAString = Integer.toHexString(a).toUpperCase();
		String binAString = Integer.toBinaryString(a);
		System.out.println();
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexAString,
		Integer.parseInt(binAString), b, c);

	}

}
