package day42_b_maps.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        // MAP - it works with KEY and VALUE pair -- > aka(as know as) ENTRY

        List<String> list = new ArrayList<>();

        //HashMap < keyDataType, valueDataType> nameOfObject = new HashMap <> ( );
        HashMap   < Integer,     String>        map          = new HashMap <> ( );
        // map.add(); - in Map, we have put(KEY, VALUE)
        // How to add KEY/VALUE
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(0, "Zero");
        map.put(-1, "MinusOne");
        map.put(20, "Two");  // Duplicate VALUES are allowed
        map.put(null, null); // null as KEY and nul as VALUE are allowed in HashMap

        //map.put("10", "Ten");  // Since KEY is Integer data type, we canNOT put String there
        map.put(Integer.parseInt("10"), "Ten");  // Since KEY is Integer data type, so, we converted "10" string into Integer 10
        System.out.println(map);


        map.put(1, "ONE");  // In Map, the KEY side does NOT allow duplicate - > so, when you add an existing KEY, Map, will update the value to the new one that is linked to that KEY
        System.out.println(map);
        map.put(1, "THIS IS ONE");
        System.out.println(map);


        // HashMap  - order ir not guaranteed/Random order. (NO insertion, NO sorted order)
        //          - NO indexes

        System.out.println("------------------------------------------------------------------");
        // How do I get the elements linked to the KEY
        System.out.println(map.get(2)); // 2 in here is not the INDEX, it is the KEY - it will return the VALUE assigned to Integer 2
        System.out.println(map.get(5)); // 5 in here is not the INDEX, it is the KEY - since it does not exist, it will return null meaning nothing is there
        String str = map.get(3);        // 3 in here is NOT the INDEX, it is the KEY - it will return the VALUE "three" which is assigned-linked to Integer 3
        System.out.println(str);


        System.out.println("------------------------------------------------------------------");
        // How to remove KEY/VALUE
        map.remove(1); // To remove we provide KEY and if that KEY exists, it will remove KEY - VALUE pair ---- this method also, returns what was removed as Object
        System.out.println(map);
        System.out.println(map.remove(11));
        System.out.println(map.remove(0));  // In here we remvoed the KEY which 0 and linked value "Zero" - since this method returned what was removed, I printed it.
        System.out.println(map);


        System.out.println("------------------------------------------------------------------");
        // How to check if the specific KEY exist among all the KEYS
        System.out.println(map.containsKey(11));  //All the available KEYS: [-1, 2, 3, 4, 10]
        System.out.println(map.containsKey(-1));  //All the available KEYS: [-1, 2, 3, 4, 10]

        // How to check is the specific VALUE exist among all the VALUES
        System.out.println(map.containsValue("One"));  // all the available VALUES: ["MinusOne", "Two", "Three", "Four", "Ten"]
        System.out.println(map.containsValue("MinusOne"));  // all the available VALUES: ["MinusOne", "Two", "Three", "Four", "Ten"]
        System.out.println(  map.get(-1).contains("One")  ); // map.get(-1) --- > "MinusOne".contains("One")
        System.out.println(  map.get(-1).toLowerCase().contains("one")  ); // map.get(-1) --- > "MinusOne".toLowerCase()---- > "minusone".contains("one") --- > true
        System.out.println(map);


        System.out.println("------------------------------------------------------------------");
        map.put(null, "NewValue");
        System.out.println(map);
        map.put(30, null);
        map.put(40, null);  // Duplicate VALUES are allowed
        System.out.println(map);


        System.out.println("------------------------------------------------------------------");

        Map <String, String> cartoonCharacters = new HashMap <> ( );
        cartoonCharacters.put("Tom", "Jerry");
        cartoonCharacters.put("Winnie", "Pooh");


        Map <String, String> moviesStars = new HashMap <> ( );
        moviesStars.put("James", "Bond");
        moviesStars.put("Sherlock", "Holmes");


        Map <String, Map<String, String> > infoForEachGroup = new HashMap <> ( );
        infoForEachGroup.put("CartoonCharacters", cartoonCharacters);
        infoForEachGroup.put("MoviesStars", moviesStars);

        System.out.println(cartoonCharacters);
        System.out.println(moviesStars);
        System.out.println(infoForEachGroup);

        Map <String, String> infoForCharacterGroup = infoForEachGroup.get("CartoonCharacters");
        System.out.println(infoForCharacterGroup);


        // Can you get me the last name that is associated with James from infoForEachGroup map
        infoForEachGroup.get("MoviesStars"); // {Sherlock=Holmes, James=Bond}
        System.out.println( infoForEachGroup.get("MoviesStars").get("James") ); //Bond


    }
}
