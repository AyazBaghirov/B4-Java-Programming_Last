package day15_string;

import java.util.Scanner;

/*

    create a class Title
    ask the user to enter their name including titles
    use the following titles to determine how to refer to the person as

    handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

        titles: [starts]

            Mr or Mister ---> Mr. Tom
            Ms or Miss or MS or Madam  -- > Hello Ma'am
            Dr

        and some titles can come after a name: [ends]

            Sr
            Jr

    Based on both starting and ending titles print the following messages:

            Mr or Mister: Hello Sir
            Ms or Miss or Madam: Hello Ma'am
            Dr: Hello Doctor

            Sr: Nice to meet you Senior
            Jr: Nice to meet you Junior

    Note: It is possible to have both beginning and ending titles, one of them, or none of them

 */
public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter you name with titles: ");
        String name = key.nextLine().toLowerCase(); // Mr. Tom Jerry -- > mr. tom jerry --> Hello Mister


        if (name.startsWith("mr.") || name.startsWith("mister.") ) { // startsWithIgnoreCase()
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms.") || name.startsWith("miss.") || name.startsWith("Madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        }


        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you senior");
        } else if ( name.endsWith( " jr")) {
            System.out.println("Nice to meet you junior");
        }


//        String titles = "Ms.".toLowerCase();
//        switch (titles) { // Mr.Tom
//            case "mr.":  // "Mr.Tom Jerry".equals("mr.")
//                System.out.println("Hello Sir");
//                break;
//            case "ms.": // titles.equals("ms.");
//                System.out.println("Hello Ma'am");
//        }


    }
}
