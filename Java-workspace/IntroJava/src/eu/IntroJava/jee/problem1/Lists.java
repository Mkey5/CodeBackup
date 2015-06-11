package eu.IntroJava.jee.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++){
			System.out.print(i + 1 + ": ");
			int n = Integer.parseInt(scanner.nextLine());
			list.add(n);
		}
		
/*		for(int n : list){
			System.out.println(n);
			
		}*/
		
		System.out.println("Enter index: ");
		int index = Integer.parseInt(scanner.nextLine());
		try{
			System.out.println(list.get(index));
		}catch (IndexOutOfBoundsException e){
			System.out.println("Ti si prost!");
		}
		// the list can read data separated by a space without the need of using YOURLIST.removeAll(Collections.singleton(null));
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("Enter \"x\" and \"y\" separated by a space : ");
		for (int i = 0; i <3; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			myList.add(x);
			myList.add(y);
			
		}
	}

}
