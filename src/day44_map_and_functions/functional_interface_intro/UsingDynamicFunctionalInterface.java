package day44_map_and_functions.functional_interface_intro;

public class UsingDynamicFunctionalInterface {
    public static void main(String[] args) {

        DynamicFunctionalInterface <String> printChars = (str)->{
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };



        DynamicFunctionalInterface <Integer> printNum5Times = (number) -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(number);
            }
        };


        printChars.test("Hello");
        System.out.println("---");
        printNum5Times.test(2);
        // printNum5Times.test(.....);  // Integer --- > reference is printNum5Times <Integer>
        // printChars.test(.....);      // String  --- > reference is printChars <String>




    }
}