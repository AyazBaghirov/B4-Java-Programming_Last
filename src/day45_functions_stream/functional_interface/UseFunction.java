package day45_functions_stream.functional_interface;

import java.util.*;
import java.util.function.Function;

/**
 Function<T, R>:
 method: R apply(T t)
 */
public class UseFunction {
    public static void main(String[] args) {


        // Implement a code that converts array into List
        Function <int [], List <Integer>> convertArrToList = (arr) -> {
            List <Integer> list = new ArrayList<>();
            for ( int each : arr) {
                list.add(each);
            }
            return list;
        };




        int [] arrNum = {233, 345, 1, 5, 645, 23, 1};
        System.out.println(arrNum);
        System.out.println(Arrays.toString(arrNum));
        System.out.println( convertArrToList.apply(arrNum) );

        // can you remove duplicates
        //convertArrToList.apply(arrNum);
        System.out.println(new HashSet<>(convertArrToList.apply(arrNum)));

        // can you remove duplicate and sort
        System.out.println(new TreeSet<>(convertArrToList.apply(arrNum)));



        // Cna you keep all original values and still sort
        List<Integer> list3 = convertArrToList.apply(arrNum);
        Collections.sort(list3);
        System.out.println(list3);


    }
}