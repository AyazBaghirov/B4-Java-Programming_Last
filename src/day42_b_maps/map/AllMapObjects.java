package day42_b_maps.map;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        // <TeacherName, ClassName>
        Map<String, String> map1 = new HashMap<>();
        map1.put("feyruz", "Java");
        map1.put("nadir", "Selenium");
        map1.put("Diana", "MentorGroup2");
        map1.put("Iryna", "MentorGroup1");
        map1.put(null, "GeneralText"); // null is OK as KEY
        map1.put("test", null); // null is OK as VALUE
        map1.put("check", null); // null is OK as VALUE even if it is duplicate

        System.out.println(map1);
        // HashMap: NO DUPLICATE KEY - DUPLICATE VALUES OK - Random Order - null as KEY is allowed - null as VALUE is allowed



        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("feyruz", "Java");
        map2.put("nadir", "Selenium");
        map2.put("Diana", "MentorGroup2");
        map2.put("Iryna", "MentorGroup1");
        map2.put(null, "GeneralText"); // null is OK
        map2.put("test", null); // null is OK as VALUE
        map2.put("check", null); // null is OK as VALUE even if it is duplicate
        System.out.println(map2);
        // LinkedHashMap: NO DUPLICATE KEY - Insertion Order - null as KEY is allowed - null as VALUE is allowed


        Map<String, String> map3 = new TreeMap<>();
        map3.put("feyruz", "Java");
        map3.put("nadir", "Selenium");
        map3.put("Diana", "MentorGroup2");
        map3.put("Iryna", "MentorGroup1");
        //map3.put(null, "GeneralText"); // null is NOT OK as KEY
        map3.put("test", null); // null is OK as VALUE
        map3.put("check", null); // null is OK as VALUE even if it is duplicate
        System.out.println(map3);
        // LinkedHashMap: NO DUPLICATE KEY - SORTED Order (ASCII) - null as KEY is NOT allowed - null as VALUE is allowed


        Map<String, String> map4 = new Hashtable<>();
        map4.put("feyruz", "Java");
        map4.put("nadir", "Selenium");
        map4.put("Diana", "MentorGroup2");
        map4.put("Iryna", "MentorGroup1");
        // map4.put(null, "GeneralText"); // null is NOT OK as KEY
        // map4.put("test", null); // null is NOT OK as VALUE either
        // map4.put("check", null); // null is NOT OK as VALUE either
        System.out.println(map4);
        // LinkedHashMap: NO DUPLICATE KEY - Random Order - null as KEY is NOT allowed - null as VALUE is NOT allowed - it is SYNCHRONIZED (Thread-safe)


    }
}
