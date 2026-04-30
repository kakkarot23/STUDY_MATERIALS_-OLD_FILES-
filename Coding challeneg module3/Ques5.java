import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
       
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(1, "Orange");
        treeMap.put(3, "Mango");

        
        System.out.println("Iterating over TreeMap using keySet:");
        iterateUsingKeySet(treeMap);


        System.out.println("\nIterating over TreeMap using entrySet:");
        iterateUsingEntrySet(treeMap);
    }

    private static void iterateUsingKeySet(TreeMap<Integer, String> treeMap) {
        Set<Integer> keySet = treeMap.keySet();
        for (Integer key : keySet) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }


    private static void iterateUsingEntrySet(TreeMap<Integer, String> treeMap) {
        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


//output
//E:\INMAKES SUMBITED\New folder>javac Ques5.java

//E:\INMAKES SUMBITED\New folder>java Ques5
//Iterating over TreeMap using keySet:
//Key: 1, Value: Orange
//Key: 2, Value: Banana
//Key: 3, Value: Mango
//Key: 4, Value: Apple

//Iterating over TreeMap using entrySet:
//Key: 1, Value: Orange
//Key: 2, Value: Banana
//Key: 3, Value: Mango
//Key: 4, Value: Apple