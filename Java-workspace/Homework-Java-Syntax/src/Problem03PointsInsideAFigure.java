import java.util.Scanner;


public class Problem03PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \"x\" and \"y\" seperated by a space: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		boolean inTheRectangle1 = (x >= 12.5 && x <= 22.5) && (y <= 8.5 && y >= 6 );
		boolean inTheRectangle2 = (x >= 12.5 && x <= 17.5) && (y <= 13.5 && y >= 8.5 );
		boolean inTheRectangle3 = (x >= 20 && x <= 22.5) && (y <= 13.5 && y >= 8.5 );
		if (inTheRectangle1 || inTheRectangle2 || inTheRectangle3) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
