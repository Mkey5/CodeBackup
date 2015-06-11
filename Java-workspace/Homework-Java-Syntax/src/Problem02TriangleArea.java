import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem02TriangleArea {

	public static void main(String[] args) {
		//(Ax(By-Cy)+Bx(Cy-Ay)+Cx(Ay-By))/2
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("Enter \"x\" and \"y\" separated by a space : ");
		for (int i = 0; i <3; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			myList.add(x);
			myList.add(y);
			
		}
		int aX= myList.get(0);		
		int aY= myList.get(1);
		
		int bX= myList.get(2);
		int bY= myList.get(3);
		
		int cX= myList.get(4);
		int cY= myList.get(5);
		if (aX == aY && bX==bY && cX==cY) {
			System.out.println("The area of the triangle = 0");
			System.out.println("The coordinates can't form a triangle!");
		}
		else {
			double area = ( (aX*(bY-cY)) + (bX*(cY-aY)) + (cX*(aY-bY)) )/2;
			System.out.println("The area of the triangle is = "+Math.round(area));
		}

	}

}
