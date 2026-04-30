import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ques3 {
    public static void main(String[] args) {
       
        HashSet<String> hashSet = new HashSet<>();

      
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");


        System.out.println("Original HashSet: " + hashSet);

   
        ArrayList<String> arrayList = convertHashSetToArrayList(hashSet);

        
        System.out.println("ArrayList after conversion: " + arrayList);
    }


    private static <T> ArrayList<T> convertHashSetToArrayList(HashSet<T> hashSet) {

        ArrayList<T> arrayList = new ArrayList<>();

      
        Iterator<T> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }

        return arrayList;
    }
}

//output

//E:\INMAKES SUMBITED\New folder>javac Ques3.java

//E:\INMAKES SUMBITED\New folder>java Ques3
//Original HashSet: [Apple, Mango, Orange, Banana]
//ArrayList after conversion: [Apple, Mango, Orange, Banana]
