import java.util.Scanner;

public class Ques10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Invalid dimensions.");
            scanner.close();
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(matrixA, scanner);

        
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(matrixB, scanner);

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix after multiplication:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    
    private static void inputMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//output

//E:\INMAKES SUMBITED\Coding challeneg array module>java Ques10
//Enter the number of rows for the first matrix: 3
//Enter the number of columns for the first matrix: 3
//Enter the number of rows for the second matrix: 3
//Enter the number of columns for the second matrix: 3
//Enter elements for the first matrix:
//Enter at [0][0]: 1
//Enter at [0][1]: 2
//Enter at [0][2]: 3
//Enter at [1][0]: 4
//Enter at [1][1]: 5
//Enter at [1][2]: 6
//Enter at [2][0]: 7
//Enter at [2][1]: 8
//Enter at [2][2]: 9
//Enter elements for the second matrix:
//Enter at [0][0]: 1
//Enter at [0][1]: 2
//Enter at [0][2]: 3
//Enter at [1][0]: 4
//Enter at [1][1]: 5
//Enter at [1][2]: 6
//Enter at [2][0]: 7
//Enter at [2][1]: 8
//Enter at [2][2]: 9
//Resultant Matrix after multiplication:
//30 36 42
//66 81 96
//102 126 150
