import java.util.Scanner;

public class Prime
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upper = scanner.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        printPrimeNumbersInRange(lower,upper);
    }

    
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    static void printPrimeNumbersInRange(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();     }
}


//Output
//E:\CODING CHALLENGE BASIC PROGRAM>javac Prime.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Prime
//Enter the lower limit: 4
//Enter the upper limit: 15
//Prime numbers between 4 and 15:
//5 7 11 13