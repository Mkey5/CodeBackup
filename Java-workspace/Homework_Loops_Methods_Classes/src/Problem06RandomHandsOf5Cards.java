import java.util.Random;
import java.util.Scanner;


public class Problem06RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] faces = {"2","3","4","5","6","7","8","9","J","Q","K","A"};
		char[] suits = {'\u2660','\u2663','\u2666','\u2665'};
		Random random = new Random();
		for (int i = 0; i < n ; i++) {
			int idxF1 = random.nextInt(faces.length);
			int idxS1 = random.nextInt(suits.length);
			
			int idxF2 = random.nextInt(faces.length);
			int idxS2 = random.nextInt(suits.length);
			
			int idxF3 = random.nextInt(faces.length);
			int idxS3 = random.nextInt(suits.length);
			
			int idxF4 = random.nextInt(faces.length);
			int idxS4 = random.nextInt(suits.length);
			
			int idxF5 = random.nextInt(faces.length);
			int idxS5 = random.nextInt(suits.length);
			System.out.printf("%s%c %s%c %s%c %s%c %s%c",faces[idxF1],suits[idxS1],faces[idxF2],suits[idxS2],faces[idxF3],suits[idxS3],
					faces[idxF4],suits[idxS4],faces[idxF5],suits[idxS5]);
			System.out.println("");
			
		}

	}

}
