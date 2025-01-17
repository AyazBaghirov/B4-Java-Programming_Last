package day41_collection.list;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {


        /*
        ArrayList <String> list = new ArrayList<>();        // Reference: ITSELF
        List <String> list1 = new ArrayList<>();            // Reference: First Interface 'List'
        Collection <String> list2 = new ArrayList<>();      // Reference: Second Interface 'Collection'
        Iterable <String> list3 = new ArrayList<>();        // Reference: Third Interface 'Iterable'
        */

        List <String> list1 = new ArrayList<>();    // Reference is List interface - object is ArrayList class - internally uses dynamic Array
        list1.add("a");             // add / remove is slower since it uses arrey in background
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null);            // null is allowed
        list1.add("a");             // duplicate elements are allowed
        System.out.println(list1);  // insertion order is kept (the order has been used to add elements is same as the elements stored)
        System.out.println(list1.get(3)); // get() comes from List interface. - ArrayList works with indexes - reading element is faster


        System.out.println();


        List <String> list2 = new LinkedList<>();   // Reference is List interface - object is LinkedList class - internally uses Nodes
        list2.add("a");             // add/remove is faster since it uses NODES in the background
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);            // null is allowed
        list2.add("a");             // duplicate elements are allowed
        System.out.println(list2);  // insertion order is kept (the order has been used to add elements is same as the elements stored)
        System.out.println(list2.get(3)); // get() comes from List interface. - ArrayList works with indexes - reading element is slower


        System.out.println();


        List <String> list3 = new Vector<>(); // Reference is List interface - object is Vector class - Thread Save (Synchronized) - extra layer - which make it slower
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);            // null is allowed
        list3.add("a");             // duplicate elements are allowed
        System.out.println(list3);  // insertion order is kept (the order has been used to add elements is same as the elements stored)
        System.out.println(list3.get(3));



    }
}
