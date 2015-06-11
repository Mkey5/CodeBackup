import java.util.ArrayList;
import java.util.Scanner;


public class Problem05AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		ArrayList<Double> angles = new ArrayList<Double>();
		ArrayList<String> units = new ArrayList<String>();
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Enter angle and unit: ");
			double angle = scanner.nextDouble();
			String unit = scanner.next();
			angles.add(angle);
			units.add(unit);	
		}
		
		
		for (int i = 0; i < angles.size(); i++) {
			
			converter(angles.get(i),units.get(i)); 
		}
		
	}
	public static void converter(double a , String b) {
		if (b.equals("deg")) {
			double angle = a * 0.017453;
			System.out.printf("%.6f rad",angle);
			System.out.println("");
			
		}
		else {
			double angle = a * 57.295779;
			System.out.printf("%.6f deg",angle);
			System.out.println("");
		}
	}
}
