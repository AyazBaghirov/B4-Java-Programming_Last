package day45_functions_stream.functional_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 BiConsumer<T, U>:
 method: void accept(T t, U u)
 */
public class BiConsumerExample {
    public static void main(String[] args) {

        // Create an implementation that takes String and Integer and prints the String number of times of given Integer
        BiConsumer <String, Integer> printNTimes = (str, n) -> {
            for (int i = 1; i <= n; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };

        printNTimes.accept("Java", 5);
        printNTimes.accept("Python", 3);

        System.out.println("-----------------------------------------");

        Map <String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 5);
        map.put("Python", 3);
        map.put("CI/CD", 6);

        // .forEach() with with Map accepts BiConsumer
        // (T t, U u) -> {}
        // On every with forEach(), take each KEY-VALUE pair use for BiConsumer input
        map.forEach( (eachKey, eachValue) -> {
            System.out.println(eachKey + " : " + eachValue);
        });

        System.out.println("*********");

        map.forEach((K, V) -> {
            System.out.println(K + " has " + K.length() + " characters");
        });



    }
}