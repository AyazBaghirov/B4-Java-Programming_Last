package day41_collection.set;

import day32_custom_classes.Employee;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {

        /*
        HashSet <String> set1 = new HashSet<>();                // Reference: itself
        Set <String> set2 = new HashSet<>();                    // Reference: First Interface 'Set'
        Collection<String> set3 = new HashSet<>();              // Reference: Second Interface 'Collection'
        Iterable<String> set4 = new HashSet<>();                // Reference: Third Interface 'Iterable'
         */



        Set <String> set1 = new HashSet<>();                    // Reference is Set interface - object is HashSet class
        set1.add(null);                         // null is allowed
        set1.add("hello");
        set1.add("$9.99");
        set1.add("400");
        set1.add("hello");                      // duplicate is NOT allowed
        set1.add("%");
        System.out.println(set1);               // insertion order is NOT kept / random order


        System.out.println();


        Set <String> set2 = new LinkedHashSet<>();                // Reference is Set interface - object is LinkedHashSet class
        set2.add(null);                         // null is allowed
        set2.add("hello");
        set2.add("$9.99");
        set2.add("400");
        set2.add("hello");                      // duplicate is NOT allowed
        set2.add("%");
        System.out.println(set2);               // insertion order is kept


        System.out.println();


        Set <String> set3 = new TreeSet<>();                // Reference is Set interface - object is LinkedHashSet class
        //set3.add(null);                         // null is NOT allowed
        set3.add("hello");
        set3.add("$9.99");
        set3.add("400");
        set3.add("hello");                      // duplicate is NOT allowed
        set3.add("%");
        set3.add("ABC");
        System.out.println(set3);               // insertion order is kept in ASCENDING order (ASCII table order)




    }
}