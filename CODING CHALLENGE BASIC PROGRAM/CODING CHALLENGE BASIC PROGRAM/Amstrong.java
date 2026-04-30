import java.util.Scanner;

public class Amstrong
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int num) {
    int originalNumber = num;
    int numberOfDigits = countDigits(num);
    int sum = 0;
    while (num != 0) {
    int digit = num % 10;
    sum += Math.pow(digit, numberOfDigits);
    num /= 10;
    }

    return originalNumber == sum;
    }

    static int countDigits(int num) 
{
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}


//output

//E:\CODING CHALLENGE BASIC PROGRAM>javac Amstrong.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Amstrong
//Enter a number: 1634
//1634 is an Armstrong number.

//E:\CODING CHALLENGE BASIC PROGRAM>java Amstrong
//Enter a number: 123
//123 is not an Armstrong number.