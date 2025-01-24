package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        //     KEY     VALUE   ------ > ENTRY (Specific for Map data structure)
        Map <String, Double> store = new HashMap<>();

        // 1.1 - .put(key, value); --- > add some KEY-VALUE pair into Map - if KEY does not exist, create the new KEY-VALUE pair
        store.put("Water", 2.9);
        store.put("Bread", 1.8);
        store.put("Cheese", 1.4);
        store.put("Coffee", 1.4);
        store.put("Potato", 1.2);

        System.out.println(store);

        // 1.2 - .put(key, value); --- > update the value which was linked to the EXISTING key (case sensitive)
        store.put("Bread", 2.1);
        System.out.println(store);


        // 2 - .get(KEY); --- > returns the VALUE that is assigned to the given KEY in the .get(KEY) method.
        System.out.println(  store.get("Water")  );
        System.out.println(  store.get("Apple")  ); // Since the KEY 'Apple' does not exist, it will return null



        // 3 - .remove( key) --- > takes a KEY and removes the ENTRY that key is linked. If not match, nothing gets removed.
        store.remove("Water");
        System.out.println(store);


        // 4 - .containsKey ( key ) --- > will take the KEY and checks if KEY exists and return Boolean value
        System.out.println( store.containsKey("Water") );
        System.out.println( store.containsKey("Coffee") );


        // 5 - .containsValue (value ) --- > will take the value and checks if VALUE exists and return Boolean value
        //            -there might be couple same values, still returns true if there is any match
        System.out.println( store.containsValue(2.1) );
        System.out.println( store.containsValue(1.4) );


        // 6 - .size() --- > it returns the number of the KEY-VALUE pairs (ENTRY's)
        System.out.println(store.size());


        System.out.println("----------------------------------");
        // 7 - .keySet (); --- > will return us a set of the keys. Since it is Set, we can use foreach to loop
        System.out.println(store.keySet());
        Set <String> keysInStore = store.keySet(); // returns Set interface
        System.out.println(keysInStore);


        // 8 - .values( ); --- >returns the Collection of Values in the map
        System.out.println( store.values() );
        Collection <Double> valuesInStore = store.values(); // return Collection interface
        System.out.println(valuesInStore);


        System.out.println("----------------------------------");
        // 7.a - loop through KEY's -- > and get each key
        for ( String eachKey : store.keySet()) {
            System.out.print (eachKey);
            System.out.println("-"+ store.get(eachKey));

        }

        System.out.println("**********************");
        // 8.a - loop through VALUE's -- > and get each value
        // store.values(); // Collection <Doubles>
        for ( Double eachValue: store.values()){
            System.out.println(eachValue);
        }




        System.out.println("**********************");
        // 9 - loop through Map (KEY-VALUE / ENTRY's)
        // store.entrySet();
        /*
                Potato-1.2 --- >  enrtrySet --- > Map <KEY, VALUE>
                Cheese-1.4 --- >  enrtrySet --- > Map <KEY, VALUE>
                Coffee-1.4 --- >  enrtrySet --- > Map <KEY, VALUE>
                Bread-2.1  --- >  enrtrySet --- > Map <KEY, VALUE>
         */

        for ( Map.Entry <String, Double> eachPair : store.entrySet()) {
            System.out.println(eachPair); // each KEY-VALUE pair is now assigned to a SINGLE MAP
            System.out.println(eachPair.getKey());
            System.out.println(eachPair.getValue());
            System.out.println("Item: "+eachPair.getKey() + "\tValue: $"+eachPair.getValue());
        }


    }
}