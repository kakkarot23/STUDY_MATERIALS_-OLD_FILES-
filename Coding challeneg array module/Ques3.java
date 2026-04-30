import java.util.Arrays;

public class Ques3 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }


    private static int[] mergeArrays(int[] array1, int[] array2) {
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];

 
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

       
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}

//output

//E:\INMAKES SUMBITED\Coding challeneg array module>javac Ques3.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques3
//Merged Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//E:\INMAKES SUMBITED\Coding challeneg array module>
