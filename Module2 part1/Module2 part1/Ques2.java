import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String uppercaseResult = convertToUppercase(input);
        String lowercaseResult = convertToLowercase(input);

        System.out.println("Uppercase: " + uppercaseResult);
        System.out.println("Lowercase: " + lowercaseResult);
    }

    private static String convertToUppercase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) (chars[i] - 32); 
            }
        }
        return new String(chars);
    }

    private static String convertToLowercase(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) (chars[i] + 32); 
            }
        }
        return new String(chars);
    }
}


//output

//E:\Module2 part1>javac Ques2.java

//E:\Module2 part1>java Ques2
//Enter a string: thisisastring
//Uppercase: THISISASTRING
//Lowercase: thisisastring