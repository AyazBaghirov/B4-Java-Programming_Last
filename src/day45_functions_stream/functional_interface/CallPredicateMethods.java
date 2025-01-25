package day45_functions_stream.functional_interface;

public class CallPredicateMethods {

    public static void main(String[] args) {

        boolean result = UsePredicate.isPalindrome.test("anna"); // boolean
        System.out.println(result);

        System.out.println( UsePredicate.isPalindrome.test("racecar"));
        System.out.println( UsePredicate.isPalindrome.test("loop"));


        System.out.println("-----------");

        boolean isPrime = UsePredicate.isPrime.test(5);
        System.out.println(isPrime);

        System.out.println( UsePredicate.isPrime.test(6));

    }

}