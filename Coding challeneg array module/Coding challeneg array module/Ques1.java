import java.util.Arrays;
import java.util.Scanner;

public class Ques1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array (sorted order):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        Arrays.sort(array);

        
        System.out.print("Enter the element: ");
        int target = scanner.nextInt();

       
        int index = binarySearch(array, target);

     
        if (index != -1) {
            System.out.println("Element found at position index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }

   
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}



//output
//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques1
//Enter the size of the array: 10
//Enter the elements of the array (sorted order):
//2
//4
//5
//6
//7
//8
//9
//12
//13
//15
//Enter the element to search: 5
//Element found at index: 2
