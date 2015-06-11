package eu.IntroJava.jee.problem1;

public class Method1 {

	public static void main(String[] args) {
		printSum(3, 6);
		
		
		System.out.println("Sqr; " + returnSqr(4, 6));
		
	}
	
	public static void printSum(int a, int b){
		System.out.println("Sum: " + (a + b));		
		
	}

	public static int returnSqr(int a, int b){
		return a *b;
	}
}
