package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) {

        Person person1 = new Person();

        try {
            person1.setName(" ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //person1.setName("Tom");


        person1.setAge(20);
        System.out.println(person1.getAge());


        person1.setAge(-10);


        System.out.println(person1.getAge());
        System.out.println("Final");

    }
}