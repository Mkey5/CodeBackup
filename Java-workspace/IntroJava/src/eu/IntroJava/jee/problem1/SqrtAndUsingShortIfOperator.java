package eu.IntroJava.jee.problem1;

public class SqrtAndUsingShortIfOperator {

	public static void main(String[] args) {
		int n = 9;
		boolean m = ( n > 0? true : false );
		System.out.println("Is it positive: " + m);
		System.out.println("Result: " + (n > 0? Math.sqrt(n) : 0));

	}

}
