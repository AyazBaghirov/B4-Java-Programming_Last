package day39_b_exception;
import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First print out");
        System.out.print ("Give me the index: ");
        int index = scanner.nextInt();

        // String str = 'loop'; // Compile exception

        String str = "loop";
        //            0123



        try {
            System.out.println( str.charAt( index ) ); // StringIndexOutOfBoundsException
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("Exception is caught");
        }


        System.out.println("Second print out");


    }
}