
public class Letp {
    public static void main(String[] args) {
        char startChar = 'A';
        int rows = 5; 

        for (int i = rows; i >= 1; i--) {
            
            for (int j = 0; j < i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }

            
            System.out.println();
        }
    }
}


//Output
//E:\CODING CHALLENGE BASIC PROGRAM>javac Letp.java

//E:\CODING CHALLENGE BASIC PROGRAM>java Letp
//A B C D E
//A B C D
//A B C
//A B
//A
