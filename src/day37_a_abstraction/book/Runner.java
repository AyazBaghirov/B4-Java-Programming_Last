package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {
        // We canNOT create object of interface. Same as abstract class
        //Create obj = new Create();

        Book obj = new Book();
        obj.read();
        obj.write();
        System.out.println(obj.NAME); // you can reach it by object reference but not recommended
        System.out.println(Book.NAME); // This is the proper way to reach it.
        System.out.println(Create.NAME); // The purpose of interface is to provide additional information (abstraction)
    }
}
