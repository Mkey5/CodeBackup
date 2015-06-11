import java.util.Scanner;


public class Problem05DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter decimal number to see how does it look like in hexadecimal:");
		int decimal = scanner.nextInt();
		String hex = Integer.toHexString(decimal);
		System.out.println(hex);
	}

}
