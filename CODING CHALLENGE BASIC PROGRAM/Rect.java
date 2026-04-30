public class Rect {
    public static void main(String[] args) {
        int rows = 3; 
        int columns = 4; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//output
//E:\CODING CHALLENGE BASIC PROGRAM>javac Rect.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Rect
//****
//*  *
//****