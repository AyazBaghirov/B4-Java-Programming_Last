package day40_exception.recap;

import java.util.ArrayList;

public class Recap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javascript");


        String s = null;


        // Short cut for couple things: MAC -- > option + command + T  / ctrl + alt + T

        try {
            System.out.println(list.get(4));  // IndexOutOfBoundsException


            System.out.println(s.length()); // NullPointerException

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out Of Bound");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
            System.out.println(e.getMessage());
        }


        System.out.println(list);
        System.out.println("---------------------------------");



        try {
            // System.out.println(list.get(4));  // IndexOutOfBoundsException


            System.out.println(s.length()); // NullPointerException

        } catch (RuntimeException e) {
            System.out.println("Index Out Of Bound OR NullPointer");
            System.out.println(e.getMessage());
        }



        System.out.println("---------------------------------");



        try {
            System.out.println(list.get(4));  // IndexOutOfBoundsException


            System.out.println(s.length()); // NullPointerException

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Index Out Of Bound OR NullPointer");
            System.out.println(e.getMessage());
        }




        System.out.println("Final Line");


    }
}