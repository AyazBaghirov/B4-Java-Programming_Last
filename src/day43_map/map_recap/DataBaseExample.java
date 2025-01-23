package day43_map.map_recap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
            Database Table: Student

                Column Names ----- >        FIRST_NAME  | LAST_NAME | BATCH_NO
                Row 1   ---------- >        Tom         | Jerry     | "3"
                Row 2   ---------- >        James       | Bond      | "3"
                Row 3   ---------- >        Winnie      | Pooh      | "3"
         */


        Map <String, Object> student1 = new LinkedHashMap();
        student1.put("FIRST_NAME", "Tom");
        student1.put("LAST_NAME", "Jerry");
        student1.put("BATCH_NO", 3);

        System.out.println(student1);


        Map <String, Object> student2 = makeMap("James", "Bond", 3);
        System.out.println(student2);

        Map <String, Object> student3 = makeMap("Winnie", "Pooh", 3);
        System.out.println(student3);


        System.out.println("----------------------------------------");
        // Now I have 3 Maps
        // Q: Can I store all these Maps into one Data structure
        List < Map <String, Object> > students = new ArrayList< >();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);


        System.out.println("----------------------------------------");

        // Get me the 2nd students last name
        students.get(1); // Map <String, Object> ---- > {FIRST_NAME=James, LAST_NAME=Bond, BATCH_NO=3}
        students.get(1).get("LAST_NAME"); // LAST_NAME=Bond --- > Bond
        System.out.println( students.get(1).get("LAST_NAME") );

        // Get me the last student first name
        students.get(students.size()-1); // will get me last Map
        students.get(students.size()-1).get("FIRST_NAME");
        System.out.println(students.get( students.size() - 1).get("FIRST_NAME") );



        System.out.println("----------------------------------------");
        // Get me each student info

        for (int i = 0; i < students.size(); i++) {
            System.out.println( students.get(i) );
        }
        System.out.println("****************************");
        for (Map <String, Object> student : students) {
            System.out.println(student);
        }



        System.out.println("----------------------------------------");
        // Get me each students First Name
        for (Map <String, Object> student : students) {
            System.out.println(student.get("FIRST_NAME"));
        }


        System.out.println("----------------------------------------");
        // get me the student which Last name 4 or less characters long
        for (Map <String, Object> eachStudent : students) {
            if ((eachStudent.get("LAST_NAME")+"").length() <= 4 ) {
                System.out.println(eachStudent);
            }
        }



    }


    public static  Map <String, Object> makeMap (String firstName, String lastName, Object batchNo) {

        Map <String, Object> student = new LinkedHashMap();
        student.put("FIRST_NAME", firstName);
        student.put("LAST_NAME", lastName);
        student.put("BATCH_NO", batchNo);

        return student;

    }

}
