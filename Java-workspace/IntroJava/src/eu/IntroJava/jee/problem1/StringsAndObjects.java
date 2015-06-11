package eu.IntroJava.jee.problem1;

public class StringsAndObjects {

	public static void main(String[] args) {
		String hello = "Hello";
		String world = "World";
		Object helloWorld = hello + " " + world;
		System.out.println(helloWorld);
		String newString = (String) helloWorld;
		System.out.println(newString);

	}

}
