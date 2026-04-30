import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCountMap = countCharacters(input);
        printRepeatedCharacters(charCountMap);
    }

    private static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                
                char lowercaseChar = Character.toLowerCase(ch);
                charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        return charCountMap;
    }

    private static void printRepeatedCharacters(Map<Character, Integer> charCountMap) {
        System.out.println("Repeated characters in the given string:");

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}



//Output
//E:\Module2 part1>javac Ques4.java

//E:\Module2 part1>java Ques4
//Enter a string: this is a program to show repeated word in a string
//Repeated characters in the given string:
//a - 4 times
//d - 2 times
//e - 3 times
//g - 2 times
//h - 2 times
//i - 4 times
//n - 2 times
//o - 4 times
//p - 2 times
//r - 5 times
//s - 4 times
//t - 4 times
//w - 2 times