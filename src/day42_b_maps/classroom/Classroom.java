package day42_b_maps.classroom;

import java.util.*;

public class Classroom {
    public static void main(String[] args) {


        Student student1 = new Student("Tom", 30, "ID#001");
        Student student2 = new Student("Jerry", 20, "ID#002");
        Student student3 = new Student("James", 40, "ID#003");
        Student student4 = new Student("Jimmy", 50, "ID#004");


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        //System.out.println(students);

        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }

        System.out.println("-------------------------------------------");
        Map<Integer, List<Student>> studentMap = new HashMap<>();
        studentMap.put(1, students);
        System.out.println(studentMap);
        // KEY is Integer
        // VALUE is List -- > 4 Student objects
        // 1 set of KEY - VALUE pair (1 ENTRY)

        System.out.println("-------------------------------------------");        Map <Integer, Student> studentMap2 = new HashMap<>();
        studentMap2.put(1, student1);
        studentMap2.put(2, student2);
        studentMap2.put(3, student3);
        studentMap2.put(4, student4);
        System.out.println(studentMap2);
        // KEY is Integer
        // VALUE is Student objet
        // 4 set of KEY - VALUE pais (4 ENTRY's)

        System.out.println("-------------------------------------------");
        studentMap2.put(5, new Student("Casey", 27, "ID#006"));
        System.out.println(studentMap2);

        System.out.println("-------------------------------------------");
        System.out.println("We have currently: " + studentMap2.size() + " students");


    }
}