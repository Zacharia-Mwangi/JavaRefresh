package Data_Structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashmapDemo {
    public static void main (String [] args){

        // create Hashmap
        HashMap<Integer, String> map = new HashMap();

        // Add Items
        map.put(21, "Twenty One");
        map.put(22, "Twenty Two");

        // Retrieve Items
        Integer key = 21;
        String value = map.get(key);
        System.out.println("Key: " + key + " Value: " + value);



        // Iterate Over map
        Iterator<Integer> keySetIterator = map.keySet().iterator();
        while (keySetIterator.hasNext()){
            Integer key_1 = keySetIterator.next();
            System.out.println("Key: " + key_1 + " Value: " + map.get(key_1));
        }

        // ContainsKey and ContainsValue
        System.out.println(" Does 21 as key Exist in Map? " + map.containsKey(21));

        System.out.println(" Does 21 as value Exist in Map? " + map.containsValue(21));



        // Is Empty?
        Boolean isEmpty = map.isEmpty();
        System.out.println(" Is Hashmap Empty? " + isEmpty);

        // Remove object
        Integer key_2 = 21;
        Object value_2 = map.remove(key_2);
        System.out.println(" Removed: " + value_2);

        map.put(31, "Thirty One");
        map.put(41, "Thirty One");

        // Sort Map
        TreeMap sorted = new TreeMap(map);
        System.out.println("Sorted HashMap: " + sorted);




    }
}
