import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int number = scanner.nextInt();

        int rNum = 0;

        while (number != 0) {
     	int digit = number % 10;
        rNum=rNum * 10 + digit;
        number /= 10;
        }

        System.out.println("Reversed number: " + rNum);
    }
}

//output
//E:\CODING CHALLENGE BASIC PROGRAM>javac ReverseNumber.java
//E:\CODING CHALLENGE BASIC PROGRAM>java ReverseNumber
//Enter the number to be reversed: 124323
//Reversed number: 323421
