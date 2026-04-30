public class Ques4 {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Original Array: " + arrayToString(array));

        insertionSort(array);

        System.out.println("Sorted Array: " + arrayToString(array));
    }

    
    private static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

         

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
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

//Output
//E:\INMAKES SUMBITED\Coding challeneg array module>javac Ques4.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques4
//Original Array: [12, 11, 13, 5, 6]
//Sorted Array: [5, 6, 11, 12, 13]