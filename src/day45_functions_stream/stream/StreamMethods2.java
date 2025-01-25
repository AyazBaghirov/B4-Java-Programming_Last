package day45_functions_stream.stream;

import day18_loops.CountLetters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        // Methods from stream - #5 - .map();  with list
        System.out.println("Method #5 - .map() ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //numbers.stream().map(); .map() works with Function from Functional Interface which accepts ONE ANY OBJECT and return ONE ANY OBJECT


        //Lets say I want to take each element from this 'numbers' list, and update each by multiplying by 2 and save all into data structure
        System.out.println("List Before Stream - .map(): " + numbers);
        // LAMBDA EXPRESSION -- > ()->{}
        numbers = numbers.stream().map(  e -> e*2 ).collect(Collectors.toList());
        System.out.println("List After Stream - .map(): " + numbers);

        System.out.println("******************************************************");
        List<String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("List Before Stream - map(): " + weekDays);
        weekDays = weekDays.stream().map( e -> e.substring(0, 3)).collect(Collectors.toList());
        System.out.println("List After Stream - map(): " + weekDays);



        System.out.println("----------------------------------------");
        // Methods from stream - #6 - .filter();  with list
        System.out.println("Method #6 - .filter() ");
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6);
        //numbers2.stream().filter(); //.filter() works with Predicate from Functional Interface which accepts ONE ANY OBJECT and return boolean

        // Find all the even numbers
        System.out.println("List Before Stream - filter(): " + numbers2);
        // LAMBDA EXPRESSION --- > () -> {}
        List <Integer> evenNums = numbers2.stream().filter( e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("List After Stream - filter(): even - " + evenNums);

        List<Integer> oddNums = numbers2.stream().filter( e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("List After Stream - filter(): odd - " + oddNums);

        // how about if I want to see only uniques - YOU CAN METHOD CHAIN it
        System.out.println(numbers2.stream().filter(e -> e % 2 == 0).distinct().collect(Collectors.toList()));
        System.out.println(numbers2.stream().filter(e -> e % 2 == 0).distinct().limit(2).collect(Collectors.toList()));


        System.out.println("----------------------------------------");
        // Methods from stream - #7 - .forEach();  with list
        System.out.println("Method #7 - .forEach() ");

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6);
        System.out.println("List Before Stream - forEach(): " + numbers4);
        //numbers4.stream().forEach(); //.forEach() works with Consumer from Functional Interface which accepts ONE ANY OBJECT and return void (NOTHING)

        numbers4.stream().forEach( e -> System.out.print(e + " ") ); // loops through and prints
        System.out.println();
        numbers4.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " ") );
        System.out.println();
        numbers4.stream().distinct().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " ") );

    }
}
