package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list);

        // removeAll(object) -- > we can use this for specific element but if we have some range then might not be good idea

        // 1- try removing with traditional loop - with this way, once the element is removed, everything in the collection SHIFTS to the left, and causing missing some elements to be checked
        // NOTE - you can adjust the 'i' on if statement for it to work properly.
        //for (int i = 0; i < list.size(); i++) {
        //    //System.out.println(list.get(i));
        //    if (list.get(i) <= 6) {
        //        list.remove(i);
        //    }
        //}
        //System.out.println(list);

        // i = 0 ---- > 2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //              3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        // i = 1 ---- > 3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        // .....


        // 2 - try removing with foreach loop - ConcurrentModificationException - with foreach loop, we canNOT change the size looping
        //for ( Integer eachElement : list){
        //    if (eachElement <= 6) {
        //        list.remove(eachElement);
        //    }
        //}
        //System.out.println(list);
        // 1st cycle - eachElement - 2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //                           3, 5, 6, 6, 12, 54, 23, 65, 3, 6 ------ > new size is less
        // 2nd cycle - eachElement - since the size changed foreach loop will give an Exception



        // 3 - iterator
        Iterator <Integer> it = list.iterator(); // I need this line of a code, to be able to call hasNext(), next(), remove() form Iterator interface;
        // it = [2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6];
        while (it.hasNext()) {
            if (it.next() <= 6){
                it.remove();
            }
        }
        System.out.println(list);

        //                                                                  V
        //                                                                  2, 3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //                                                                  3, 5, 6, 6, 12, 54, 23, 65, 3, 6
        //                                                                  5, 6, 6, 12, 54, 23, 65, 3, 6
        //                                                                  6, 6, 12, 54, 23, 65, 3, 6
        //                                                                  6, 12, 54, 23, 65, 3, 6
        //                                                                  12, 54, 23, 65, 3, 6
        //                                                              12, 54, 23, 65, 3, 6
        //                                                          12, 54, 23, 65, 3, 6
        //                                                      12, 54, 23, 65, 3, 6
        //                                                  12, 54, 23, 65, 3, 6
        //                                                  12, 54, 23, 65, 6
        //                                                  12, 54, 23, 65
    }
}
