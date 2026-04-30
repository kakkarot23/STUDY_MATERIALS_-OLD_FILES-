import java.util.Arrays;

public class Ques8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        int elementToRemove = 3;

        
        array = removeElement(array, elementToRemove);

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
    }

    
    private static int[] removeElement(int[] array, int elementToRemove) {
        int length = array.length;

        boolean found = false;
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (array[i] == elementToRemove) {
                found = true;
                index = i;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + elementToRemove + " not found in the array.");
            return array; 
        }

        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }

        int[] newArray = new int[length - 1];
        System.arraycopy(array, 0, newArray, 0, length - 1);

        return newArray;
    }
}


//output

//E:\INMAKES SUMBITED\Coding challenege array module>javac Ques8.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques8
//Original Array: [1, 2, 3, 4, 5]
//Array after removing 3: [1, 2, 4, 5]