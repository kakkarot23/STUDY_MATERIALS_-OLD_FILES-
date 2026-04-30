import java.util.Scanner;

public class Ques7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeFirstLastCharacter(input);

        System.out.println("String after removing first and last character: " + result);
    }

    private static String removeFirstLastCharacter(String input) {
        
        if (input.length() >= 2) {
            
            return input.substring(1, input.length() - 1);
        } else {
            
            return "";
        }
    }
}



//Output

//E:\Module2 part1>javac Ques7.java

//E:\Module2 part1>java Ques7
//Enter a string: remove
//String after removing first and last character: emov
