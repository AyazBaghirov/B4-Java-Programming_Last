package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // stream is not a data structure, it is a method that get the input from all other data structure which will help us to use some build-in re-useful methods.

        // .stream(); ---- > array and arrayList

        // #1 - stream with array
        int [] arr = {1,2,3,4,5};
        // To use stream with array --- > convert array into stream
        // arr.stream(); // --- NOT VALID with array
        // THis is how we convert array into stream
        Arrays.stream(arr);


        // #2 - stream with arrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.stream();


        //"----------------------------------------"
        System.out.println("Method #1 - .distinct() ");
        // Methods from stream - #1 - .distinct();  with list
        List <Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,3,6,8,6,7));
        System.out.println("List Before Stream - .distint() :" + list2);
        //list2.stream(); // this will convert list into stream
        //System.out.println(list2.stream()); // this will show some kind of memory location
        //System.out.println( list2.stream().distinct() ); // even after applying methods from steam and print it out, it still will show some memory location

        System.out.println("List After Stream - .distint() : " + list2.stream().distinct().collect(Collectors.toList()));
        /*
             list2.stream()                                             ---> converts list data structure to stream
             list2.stream().distinct()                                  ---> once converted into stream, applying distinct();
             list2.stream().distinct().collect(Collectors.toList())     ---> once converted into stream and applying distinct();, then I convert it back to List
         */

        System.out.println("*****************************************");
        // Methods from stream - #1 - .distinct();  with array
        int [] arr2 = {1,2,3,4,5,2,3,6,8,6,7};
        System.out.println("Array Before Stream - .distint() :" + Arrays.toString(arr2));
        // arr2.stream(); // NOT VALID way to convert array into stream
        // Arrays.stream(arr2);  // this will convert array into stream
        // System.out.println(Arrays.stream(arr2)); // this will show some kind of memory location
        // System.out.println(Arrays.stream(arr2).distinct()); // this will show some kind of memory location
        //System.out.println(Arrays.stream(arr2).distinct().toArray()); // this will show some kind of memory location - because we cannot print array directly.
        //int [] arr3 =  Arrays.stream(arr2).distinct().toArray(); // you can assign it back to array once you converted from stream back to array
        //System.out.println("Array After Stream: " +  Arrays.toString(arr3));
        System.out.println("Array After Stream:  - .distint() :" +  Arrays.toString(Arrays.stream(arr2).distinct().toArray()));


        System.out.println("----------------------------------------");
        // Methods from stream - #2 - .skip();  with list
        System.out.println("Method #2 - .skip() ");
        List <Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("List Before Stream - .skip(): " + list3);
        System.out.println("List After Stream - .skip(): " + list3.stream().skip(4).collect(Collectors.toList()));

        // Methods from stream - #2 - .skip();  with array
        System.out.println("Array After Stream - .skip(): " + Arrays.toString(Arrays.stream(arr2).skip(6).toArray()));



        System.out.println("----------------------------------------");
        System.out.println("Method #3 - .limit() ");
        // Methods from stream - #3 - .limit();  with list
        List <Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("List Before Stream - .limit(): " + list4);
        System.out.println("List After Stream - .limit(): " + list4.stream().limit(5).collect(Collectors.toList()));
        System.out.println("List After Stream - .limit() + .skip(): " + list4.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println("List After Stream - .skip() + .limit(): " + list4.stream().skip(3).limit(5).collect(Collectors.toList()));



        System.out.println("----------------------------------------");
        System.out.println("Method #4 - .count() ");
        // Methods from stream - #4 - .count();  with list
        List <Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6));
        System.out.println("List Before Stream - .count(): " + list5);
        System.out.println("Size of the list: " + list5.size());
        System.out.println("Count of the list: " + list5.stream().count());

        // get me the count without including duplicates
        System.out.println("List Before Stream - .distinct() + .count(): "  + list5.stream().distinct().count());

        // can you tell me how many duplicates I have
        System.out.println( "Count of duplicates: " + (list5.size() - list5.stream().distinct().count()));


        String str = "aaaaaabbbbbbcccccddddddffffgggg";
        // Get me how many different letter I ahve

        // nstr.split(""); // converts string into string []
        // Arrays.stream(str.split("")); // converted string [] into stream
        System.out.println("Count of different letters: " + Arrays.stream(str.split("")).distinct().count());
        System.out.println("Count of different letters in array: " + Arrays.toString(Arrays.stream(str.split("")).distinct().toArray()));
        System.out.println("Count of different letters in list: " + Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));

        /*
            You can use stream with any kind of COLLECTION Interface - List, Set + Map
         */

    }
}
