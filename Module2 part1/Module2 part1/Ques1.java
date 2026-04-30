import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphanumeric string: ");
        String input = scanner.nextLine();

        String digits = extractDigits(input);

        System.out.println("Digits in the given string: " + digits);
    }

    private static String extractDigits(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}


//output

//E:\Module2 part1>javac Ques1.java

//E:\Module2 part1>java Ques1
//Enter an alphanumeric string: abc123
//Digits in the given string: 123

//E:\Module2 part1>java Ques1
//Enter an alphanumeric string: 75#41
//Digits in the given string: 7541