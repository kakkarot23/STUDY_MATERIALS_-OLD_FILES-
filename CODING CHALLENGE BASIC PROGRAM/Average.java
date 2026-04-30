import java.util.Scanner;

public class Average
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        double sum = 0;
        int Tnum = 5;

        for (int i = 0; i < Tnum; i++) 
	    {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / Tnum;
        System.out.println("The average of the five numbers is: " + average);
    }
}


//output

//E:\CODING CHALLENGE BASIC PROGRAM>javac Average.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Average
//Enter the numbers:
//Enter number 1: 1
//Enter number 2: 2
//Enter number 3: 3
//Enter number 4: 4
//Enter number 5: 5
//The average of the five numbers is: 3.0