public class Star1 {
    public static void main(String[] args) {
        int rows = 5; 
        
        for (int i = 0; i < rows; i++) {
          
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }

           
            for (int j = 1; j <=2 * (rows - i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//Output

//E:\CODING CHALLENGE BASIC PROGRAM>javac Star1.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Star1
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *


