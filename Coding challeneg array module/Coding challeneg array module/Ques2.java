import java.util.Arrays;
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

       
        int thirdLargest = findThirdLargest(array);
        System.out.println("Third Largest Element: " + thirdLargest);


        int secondSmallest = findSecondSmallest(array);
        System.out.println("Second Smallest Element: " + secondSmallest);

        scanner.close();
    }


    private static int findThirdLargest(int[] array) {
        Arrays.sort(array);
        if (array.length < 3) {
            System.out.println("Array size is less than 3. Cannot find third largest.");
            return -1; // Return a default value or handle the case appropriately
        }
        return array[array.length - 3];
    }

    private static int findSecondSmallest(int[] array) {
        Arrays.sort(array);
        if (array.length < 2) {
            System.out.println("Array size is less than 2. Cannot find second smallest.");
            return -1; // Return a default value or handle the case appropriately
        }
        return array[1];
    }
}


//output
E:\INMAKES SUMBITED\Coding challeneg array module>java Ques2
Enter the size of the array: 6
Enter the elements of the array:
2
5
7
8
9
10
Third Largest Element: 8
Second Smallest Element: 5