package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> listOfModules = new ArrayList<>();
        listOfModules.add("Java");
        listOfModules.add("Sofskills");
        listOfModules.add("Database");
        listOfModules.add("Api");
        listOfModules.add("Java");
        ArrayList<String> listOfModule2 = new ArrayList<>(listOfModules);
        System.out.println(listOfModules);


        // I got two options to remove
        // 1 - Using Iterator: To be able to use iterator, I need assign my collection data structure to Iterator
        Iterator <String> anyName = listOfModules.iterator();  // iterator(); returns your Collection data structure as Iterator. I need it because need to be able to access hasNext(), next(), remove() from Iterator


        System.out.println(anyName.hasNext());
        System.out.println(anyName.next());
        System.out.println(anyName.hasNext());
        System.out.println(anyName.next());
        System.out.println(anyName.hasNext());
        System.out.println(anyName.next());
        System.out.println(anyName.hasNext());
        System.out.println(anyName.next());
        System.out.println(anyName.hasNext());
        System.out.println(anyName.next());
        System.out.println(anyName.hasNext());
        // System.out.println(anyName.next()); // NoSuchElementException


        // Reassigning it - so I start from beginning again.
        anyName = listOfModules.iterator();

        while (anyName.hasNext()) { // in here my hasNext() -- >  returns me false
            if (anyName.next().length() > 4){
                anyName.remove();
            }
        }
        System.out.println(listOfModules);

        System.out.println("------------------------------");

        System.out.println(listOfModule2);
        listOfModule2.removeIf(each -> each.length() > 4);
        System.out.println(listOfModule2);



    }
}