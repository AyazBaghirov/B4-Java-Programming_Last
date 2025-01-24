package day44_map_and_functions.string_sbuilder_sbuffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {


        // 1.   String
        //      Strings are IMMUTABLE
        String str1 = "loopcamp";                           // Stored it in String Pool in Heap
        System.out.println("String: " + str1);

        String str2 = new String("loopcamp");        // Stored it in directly HEAP
        str1 = str1 + str2;                                 // this line created COMPLETELY a new object in HEAP
        System.out.println("String: " + str1);


        System.out.println("-----------------");
        // 2. StringBuilder
        //    StringBuilder is MUTABLE - can ONLY be created by 'new' keyword - It is NOT synchronized-NOT thread sage
        StringBuilder strBuilder1 = new StringBuilder("loopcamp");  // Stored it in directly HEAP
        System.out.println("StringBuilder: " + strBuilder1);
        strBuilder1.append("loopcamp");                             // this line does NOT create a new object, it updates.
        System.out.println("StringBuilder: " + strBuilder1);
        // StringBuilder strBuilder2 = "loop";


        System.out.println("-----------------");
        // 3. StringBuffer
        //    StringBuffer is MUTABLE - can ONLY be created by 'new' keyword - is synchronized-thread safe
        StringBuffer stringBuffer1 = new StringBuffer("loopcamp");
        System.out.println("StringBuffer: " + stringBuffer1);
        //StringBuffer stringBuffer2 = "loopcamp";
        stringBuffer1.reverse();                                    // this line does NOT create a new object, it updates.
        System.out.println("StringBuffer: " + stringBuffer1);


    }
}