import java.util.ArrayList;

public class Ques2 {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        if (isArrayListEmpty(arrayList)) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }


        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");


        if (isArrayListEmpty(arrayList)) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }

    
    private static boolean isArrayListEmpty(ArrayList<?> list) {
        return list.isEmpty();
    }
}

//output

//E:\INMAKES SUMBITED\New folder>javac Ques2.java

//E:\INMAKES SUMBITED\New folder>java Ques2
//ArrayList is empty.
//ArrayList is not empty.
