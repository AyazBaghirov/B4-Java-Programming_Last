package day45_functions_stream.functional_interface;

import java.util.function.Predicate;

/**
 Predicate<T>
 method: boolean test(T t)
 */
public class UsePredicate {

    public static Predicate <String> isPalindrome = (str) -> {
        // check is String str is palindrome (same from beginning and end)
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        return str.equals(reversedStr.toString());
    };


    static Predicate <Integer> isPrime = (num) -> {
        // check is num is prime - divisible itself and 1 : divisible 2 times
        int count = 0;
        //                  5
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    };


}