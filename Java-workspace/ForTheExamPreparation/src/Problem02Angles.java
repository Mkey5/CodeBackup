import java.util.ArrayList;
import java.util.Scanner;


public class Problem02Angles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> angles = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int m = scanner.nextInt();
			angles.add(m);
		}
		
		boolean checker = false;
		for (int i = 0; i < angles.size(); i++) {
			for (int j = i+1; j < angles.size(); j++) {
				for (int j2 = j+1; j2 < angles.size(); j2++) {
					if ((angles.get(i)+angles.get(j)+angles.get(j2))%360==0) {
						System.out.printf("%d + %d + %d = %d degrees",
								angles.get(i),angles.get(j),angles.get(j2),
									(angles.get(i)+angles.get(j)+angles.get(j2)));
						System.out.println();
						checker = true;
					}
				}
					
				}
			}
		
		if (checker == false) {
			System.out.println("No");
		}
		
		
		}

	}
