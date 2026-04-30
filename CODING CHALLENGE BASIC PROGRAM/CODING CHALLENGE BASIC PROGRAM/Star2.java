public class Star2 {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        for (int i = 0; i < rows; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

//Output
//*******
// *****
//  ***
//   **
//    *
