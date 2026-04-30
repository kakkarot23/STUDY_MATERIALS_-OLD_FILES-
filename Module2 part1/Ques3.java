import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedWords = reverseWords(input);

        System.out.println("Reversed words: " + reversedWords);
    }

    private static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]).append(" ");
        }

        return reversedWords.toString().trim();
    }
}


//Output
//E:\Module2 part1>javac Ques3.java

//E:\Module2 part1>java Ques3
//Enter a string: i am a developer
//Reversed words: developer a am i