import java.util.Scanner;


public class Problem02Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String generator = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				for (int j2 = 0; j2 < input.length(); j2++) {
					generator = ""+input.charAt(i)+input.charAt(j)+input.charAt(j2);
					System.out.print(generator+ " ");
				}
			}
		}
	}
}
