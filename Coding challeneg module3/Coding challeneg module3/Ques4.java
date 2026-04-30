import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
      
        HashMap<Integer, String> hashMap = new HashMap<>();


        hashMap.put(4, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(1, "Orange");
        hashMap.put(3, "Mango");


        System.out.println("Original HashMap: " + hashMap);


        Map<Integer, String> sortedMap = sortHashMapByKeys(hashMap);

       
        System.out.println("HashMap after sorting by keys: " + sortedMap);
    }

 
    private static <K extends Comparable<? super K>, V> Map<K, V> sortHashMapByKeys(Map<K, V> map) {
 
        TreeMap<K, V> sortedMap = new TreeMap<>(map);


        LinkedHashMap<K, V> result = new LinkedHashMap<>();

       
        sortedMap.forEach((key, value) -> result.put(key, value));

        return result;
    }
}


//output
//E:\INMAKES SUMBITED\New folder>javac Ques4.java

//E:\INMAKES SUMBITED\New folder>java Ques4
//Original HashMap: {1=Orange, 2=Banana, 3=Mango, 4=Apple}
//HashMap after sorting by keys: {1=Orange, 2=Banana, 3=Mango, 4=Apple}