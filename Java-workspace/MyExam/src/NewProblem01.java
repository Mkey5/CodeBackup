import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NewProblem01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().trim().split("[\\s]+");
			String forEncript = line[0];
			for (int j = 1; j < line.length; j++) {
//				String element = line[j].trim();
				String element = line[j];
				forEncript+= element;
			}
			
			
			String withOutD = forEncript.substring(0, 1);
			
			for (int s = 1; s < forEncript.length(); s++) {
				char load = forEncript.charAt(s);
				if((int)load < 48 || (int)load > 57){
					withOutD+=load;
				}
			}
			
			int inputLength = (withOutD.length())/2;
			
			for (int m = 0; m < line.length; m++) {
				String el = line[m];
				if(el.matches("^\\d+$")){
					System.out.print(el);
				}else{
					for (int k = 0; k < el.length(); k++) {
						char firstChar = el.charAt(k);
						
						if(String.valueOf(firstChar).matches("[0-9]")){
							System.out.print(firstChar);
						}else{
							int modChar = firstChar + inputLength;
							char endChar = (char) modChar;
							System.out.print(endChar);
						}
						
					}
				}
				
				System.out.print(" ");
			}
			
			
			
			System.out.println();
		}

	}

}