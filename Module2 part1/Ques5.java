import java.util.Scanner;

public class Ques5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the given string: " + vowelCount);
    }

    private static int countVowels(String input) {
        int count = 0;

        for (char ch : input.toLowerCase().toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


//output
//E:\Module2 part1>javac Ques5.java

//E:\Module2 part1>java Ques5
//Enter a string: this is a string
//Number of vowels in the given string: 4