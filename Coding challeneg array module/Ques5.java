import java.util.Arrays;

public class  {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 8, 9};

        System.out.println("Original Array: " + arrayToString(array));

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + arrayToString(uniqueArray));
    }

    
    private static int[] removeDuplicates(int[] array) {
        
        Arrays.sort(array);

        int n = array.length;

        
        int uniqueCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueCount++;
            }
        }

        
        uniqueCount++;

        
        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = array[0];
        int index = 1;

        
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index] = array[i];
                index++;
            }
        }

        return uniqueArray;
    }

    
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}


//output
//E:\INMAKES SUMBITED\Coding challeneg array module>javac Ques5.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques5
//Original Array: [1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 8, 9]
//	Array after removing duplicates: [1, 2, 3, 4, 5, 6, 7, 8, 9]
