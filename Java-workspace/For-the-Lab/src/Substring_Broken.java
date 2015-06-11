

import java.util.Scanner;

public class Substring_Broken {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());

        char search = 'р';
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'p') {
                hasMatch = true;

                int endIndex = jump;

                if (endIndex > text.length()) {
                    endIndex = text.length();
                }

                String matchedString = text.substring(i, i + endIndex+1);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
