package day35_inheritance.book;
// Runner Class
public class Library {
    public static void main(String[] args) {
        AudioBook ab1 = new AudioBook();
        // ab1 object has access to 9 instance variables. - Has the access to its own class members and the on from parent
        ab1.duration = 100; // mins
        ab1.narrator = "Morgan Freeman";
        ab1.title = "Java is Awesome";
        //ab1 object has access to 1 instance method. - Has the access to its own class members and the on from parent
        ab1.listen();
        //ab1.read();


        EBook eb1 = new EBook();
        //eb1 object has access to 9 instance variables - Has the access to its own class members and the on from parent
        eb1.size = 10; //MB
        eb1.pages = 600;
        eb1.title = "Selenium";
        // eb1 object has access to 1 instance method - Has the access to its own class members and the on from parent
        eb1.read();
        //eb1.listen();


        Book b1 = new Book();
        //b1 object has access to 7 instance variables. - Has the access to its own class members and nothihg from child.
        //b1.authorName = "Ab Jerry";
        //b1.narrator;
        //b1.pages;


        Author a1 = new Author("FEYRUZ JErry", -23);
        System.out.println(a1);


        Book b2 = new Book();
        System.out.println(b2.author);//  Author author --- > for b2
        //Author a2 = new Author("Nadir Softskills", 30);
        b2.author = new Author("Nadir Softskills", 30);
        System.out.println(b2.author);


        AudioBook ab3 = new AudioBook();
        ab3.author = new Author("Tom Freeman", 40);
        System.out.println(ab3.author);

        EBook eb2 = new EBook();
        eb2.author = new Author("John Freeman", 50);
        System.out.println(eb2.author);


    }
}