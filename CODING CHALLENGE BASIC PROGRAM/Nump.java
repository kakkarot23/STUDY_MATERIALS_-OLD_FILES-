public class Nump {
    public static void main(String[] args) {
        int rows = 7; 
        int currentNumber = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber+ " ");
                currentNumber++;
            }
            
            System.out.println();
        }
    }
}
