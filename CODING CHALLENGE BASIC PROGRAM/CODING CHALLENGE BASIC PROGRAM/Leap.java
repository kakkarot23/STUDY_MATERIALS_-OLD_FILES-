import java.util.Scanner;

public class Leap
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }


    static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
//Output


//E:\CODING CHALLENGE BASIC PROGRAM>javac Leap.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Leap
//Enter a year: 2003
//2003 is not a leap year.

//E:\CODING CHALLENGE BASIC PROGRAM>java Leap
//Enter a year: 2004
//2004 is a leap year.