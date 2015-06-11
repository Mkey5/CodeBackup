import java.util.Scanner;


public class Problem04TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers a ,b and c.");
		System.out.println("Enter number a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter number b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter number c: ");
		double c = scanner.nextDouble();
		if ((a<=b && a<c) || (a<b && a<=c)) {
			System.out.println(a);
		}
		else if ( (b<a && b<c) || (b<a && b<=c) ) {
			System.out.println(b);
		}
		else if ( (c<=a && c<b) || (c<a && c<=b) ) {
			System.out.println(c);
		}
	}

}
