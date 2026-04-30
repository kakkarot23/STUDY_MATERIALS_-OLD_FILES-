import java.util.LinkedList;
import java.util.Scanner;

public class Ques1{
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        
        System.out.println("Original LinkedList: " + linkedList);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        
        insertElementAtPosition(linkedList, position, element);

        
        System.out.println("LinkedList after insertion: " + linkedList);
    }

   
    private static void insertElementAtPosition(LinkedList<Integer> list, int position, int element) {
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position. Position should be between 0 and " + list.size());
            return;
        }

      
        list.add(position, element);
    }
}


//output

//E:\INMAKES SUMBITED\New folder>javac Ques1.java

//E:\INMAKES SUMBITED\New folder>java Ques1
//Original LinkedList: [1, 2, 3, 4, 5]
//Enter the position to insert the element: 3
//Enter the element to insert: 67
//LinkedList after insertion: [1, 2, 3, 67, 4, 5]