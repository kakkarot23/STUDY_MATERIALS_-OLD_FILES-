import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

      static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}


//output

//E:\CODING CHALLENGE BASIC PROGRAM>javac Palindrome.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Palindrome
//Enter a number to be checked: 1234
//1234 is not a palindrome.

//E:\CODING CHALLENGE BASIC PROGRAM>java Palindrome
//Enter a number to be checked: 123321
//123321 is a palindrome.

