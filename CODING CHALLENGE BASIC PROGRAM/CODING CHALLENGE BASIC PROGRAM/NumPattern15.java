public class NumPattern15 {
    public static void main(String[] args) {
        int rows = 5; 


        for (int i = 5; i >= 1; i--) {
            
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}


//output
//E:\CODING CHALLENGE BASIC PROGRAM>javac NumPattern15.java

//E:\CODING CHALLENGE BASIC PROGRAM>java NumPattern15
//5 5 5 5 5
//4 4 4 4 4
//3 3 3 3 3
//2 2 2 2 2
//1 1 1 1 1