import java.util.Scanner;

public class Swap
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

//Output
//E:\CODING CHALLENGE BASIC PROGRAM>javac Swap.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Swap
//Enter the first number: 3
//Enter the second number: 8
//Before swapping: num1 = 3, num2 = 8
//After swapping: num1 = 8, num2 = 3