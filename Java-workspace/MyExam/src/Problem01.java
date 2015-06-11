//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//public class Problem01 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String[] favouriteFoods = {"cram","lembas","apple","melon","honeycake","mushrooms"};
//		
//		String first = scanner.nextLine();
//		int firstMood = Integer.parseInt(first);
//		String[] input = scanner.nextLine().toLowerCase().split("[ \\n\\t\\r,_.;@:!?(){}}]");
//		ArrayList<String> food = new ArrayList<String>();
//		for (int i = 0; i < input.length; i++) {
//			
//		  food.add(input[i]);
//			
//		}
//		int counter = firstMood;
//		food.removeAll(Arrays.asList("", null));
//		
//		for (int i = 0; i < food.size(); i++) {
//			if (food.get(i).equals("cram")) {
//				counter+=2;
//			}
//			else if (food.get(i).equals("lembas")) {
//				counter+=3;
//			}
//			else if (food.get(i).equals("apple")) {
//				counter+=1;
//			}
//			else if (food.get(i).equals("melon")) {
//				counter+=1;
//			}
//			else if (food.get(i).equals("honeycake")) {
//				counter+=5;
//			}
//			else if (food.get(i).equals("mushrooms")) {
//				counter-=10;
//			}
//			else {
//				counter-=1;
//			}
//		}
//		if (counter<-5) {
//			System.out.println(counter);
//			System.out.println("Angry");
//		}
//		else if (counter>=-5 && counter<0) {
//			System.out.println(counter);
//			System.out.println("Sad");
//		}
//		else if (counter>=0 && counter<15) {
//			System.out.println(counter);
//			System.out.println("Happy");
//		}
//		else  {
//			System.out.println(counter);
//			System.out.println("Special JavaScript mood");
//		}
//
//	}
//
//}

//Cram, banica,Melon!_,HoneyCake,   !Honeycake,honeycake_;
//[{(_ .!,:;?)}]
//-30
//gosho, pesho, maze, Melon, HoneyCake@;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int firstMood = scanner.nextInt();
//		scanner.nextLine();
//		String input = scanner.nextLine();
//		String lineLow = input.toLowerCase();
//		String[] food = lineLow.trim().split("[\\W\\s_]+");
//		for (int i = 0; i < food.length; i++) {
//			firstMood += getFood(food[i]);
//		}
//		System.out.println(firstMood);
//		if(firstMood <-5){
//			System.out.println("Angry");
//		}
//		else if(firstMood >=-5 && firstMood <0){
//				System.out.println("Sad");
//			}
//		else if(firstMood >=0 && firstMood <15){
//			System.out.println("Happy");
//		}
//			else if(firstMood >15){
//				System.out.println("Special JavaScript mood");
//			}
//		}
//
//	public static int getFood(String food) {
//		if (food.equals("cram"))
//			return 2;
//		if (food.equals("lembas"))
//			return 3;
//		if (food.equals("apple"))
//			return 1;
//		if (food.equals("melon"))
//			return 1;
//		if (food.equals("honeycake"))
//			return 5;
//		if (food.equals("mushrooms"))
//			return -10;
//		else {
//			return -1;
		


//		}
		String marek = "10D";
		String fuck = marek.substring(2, 3);
		System.out.println(fuck);
		int len = marek.length();
		System.out.println(len);

	}
}