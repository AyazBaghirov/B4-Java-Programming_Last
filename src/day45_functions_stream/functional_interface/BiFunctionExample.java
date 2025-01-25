package day45_functions_stream.functional_interface;

import java.util.*;
import java.util.function.BiFunction;

/**
 BiFunction<T, U, R>:
 method: R apply(T t, U u)
 */
public class BiFunctionExample {
    public static void main(String[] args) {

        // Create an implementation that accepts 2 any objet time and return 1 any object time
        // for example, compare two Integer and return the bigger
        BiFunction <Integer, Integer, Integer> getBigger = (num1, num2) -> {
            // if (num1 > num2) {
            //     return num1;
            // } else {
            //     return num2;
            // }
            return num1 > num2 ? num1 : num2;  // Ternary
        };


        System.out.println(  getBigger.apply(1, 3) );
        System.out.println(  getBigger.apply(1, -3) );

        System.out.println("---------------------------------");
        //Create an implementation that takes list of number and list of strings and return map of num as key and string as value

        BiFunction <List<Integer>, List<String>, Map <Integer, String>> createMap = (numList, strList) -> {

            Map <Integer, String> map = new LinkedHashMap<>();


            if (numList.size() != strList.size()) {
                throw new RuntimeException("Number and String lists do not match in size");
            } else {
                for (int i = 0; i < numList.size(); i++) {
                    map.put(  numList.get(i),  strList.get(i)  );
                }
            }




            return map;

        };

        List <Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));  // 6
        List <String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F")); // 6



        try {
            System.out.println( createMap.apply(numbers, letters) );
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));  // 7
        letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F")); // 6

        try {
            System.out.println( createMap.apply(numbers, letters) );
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("END");
    }
}