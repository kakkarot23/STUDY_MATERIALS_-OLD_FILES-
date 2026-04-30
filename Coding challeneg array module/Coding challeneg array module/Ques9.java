import java.util.Arrays;

public class Ques9 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        int elementToInsert = 10;
        int indexToInsert = 2;

       
        array = insertElement(array, elementToInsert, indexToInsert);

        System.out.println("Array after inserting " + elementToInsert + " at index " + indexToInsert + ": " + Arrays.toString(array));
    }

   
    private static int[] insertElement(int[] array, int element, int index) {
        int length = array.length;


        if (index < 0 || index > length) {
            System.out.println("Invalid index. Element not inserted.");
            return array; 
        }

       
        int[] newArray = new int[length + 1];


        System.arraycopy(array, 0, newArray, 0, index);


        newArray[index] = element;


        System.arraycopy(array, index, newArray, index + 1, length - index);

        return newArray;
    }
}

//output

//E:\INMAKES SUMBITED\Coding challeneg array module>javac Ques9.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques9
//Original Array: [1, 2, 3, 4, 5]
//Array after inserting 10 at index 2: [1, 2, 10, 3, 4, 5]

