package day42_b_maps.classroom;
// Template - we basically built template how the each object of this class will behave
public class Student {
    String name;
    int age;
    String ID;

    // Custom constructor removes the default constructor
    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "Student Info:" +
                "\tName: " + name +
                "\tAge: " + age +
                "\tID: " + ID;
    }

}
