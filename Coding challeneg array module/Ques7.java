public class Ques7 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array: " + arrayToString(array));

        System.out.println("Odd Numbers: ");
        printOddNumbers(array);

        System.out.println("Even Numbers: ");
        printEvenNumbers(array);
    }

    
    private static void printOddNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); 
    }

    
    private static void printEvenNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); 
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
//E:\INMAKES SUMBITED\Coding challeneg array module>javac Ques7.java

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques7
//Original Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Odd Numbers:
//1 3 5 7 9
//Even Numbers:
//2 4 6 8 10