package day39_b_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the number: ");
            int userNum = scanner.nextInt();                    // InputMismatchException


            System.out.print("Enter another number: ");
            int userNum2 = scanner.nextInt();                   // InputMismatchException


            System.out.println(userNum / userNum2);             // ArithmeticException

            //} catch (Exception e) { // PARENT exception class CANNOT be place before the CHILD exception class
            //    System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            e.printStackTrace();
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            // THis finally block will be executed NO MATTER if there was exception or there was NO exception
            System.out.println("FINALLY BLOCK");
            scanner.close();
        }


        System.out.println("Finish line");



    }
}
