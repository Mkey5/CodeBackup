import java.util.Scanner;


public class Problem01RectangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two sides of a rectangle!");
		System.out.println("Enter side \"a\": ");
		int a = scanner.nextInt();
		System.out.println("Enter side \"b\": ");
		int b = scanner.nextInt();
		System.out.println("The area of the rectangle is = "+(a*b));
	}

}
