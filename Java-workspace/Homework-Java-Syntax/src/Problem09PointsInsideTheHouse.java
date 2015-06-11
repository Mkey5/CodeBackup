import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.util.Scanner;


public class Problem09PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \"x\" and \"y\" seperated by a space: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		//these are the coordinates of the 9 points that form the house:
		double[] xPoints = { 12.5, 12.5, 17.5, 17.5, 20, 20, 22.5, 22.5, 17.5 };
		double[] yPoints = { 8.5, 13.5, 13.5, 8.5, 8.5, 13.5, 13.5, 8.5, 3.5 };
		
		//With this we create the house:
		Path2D house = new Path2D.Double();
		house.moveTo(xPoints[0] , yPoints[0]);
		for (int i = 1; i < xPoints.length; i++) {
			house.lineTo(xPoints[i], yPoints[i]);
		}
		house.closePath();
		//With this we create the "roof" of the house - the rectangle:
		Rectangle houseRoof = new Rectangle();
		houseRoof = house.getBounds();
		
		if ( ( house.contains(x, y) ) && ( houseRoof.contains(x, y) ) ) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		
		
		
		

	}

}
