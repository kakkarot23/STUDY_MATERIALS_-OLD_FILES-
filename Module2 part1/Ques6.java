import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.nextLine();

        String result = removeWord(input, wordToRemove);

        System.out.println("String after removing the word: " + result);
    }

    private static String removeWord(String input, String wordToRemove) {
        
        return input.replaceAll("\\b" + wordToRemove + "\\b", "").trim();
    }
}


//output
//E:\Module2 part1>javac Ques6.java

//E:\Module2 part1>java Ques6
//Enter a string: this is a string
//Enter the word to remove: string
//String after removing the word: this is a