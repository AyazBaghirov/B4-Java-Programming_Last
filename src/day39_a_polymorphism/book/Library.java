package day39_a_polymorphism.book;

import day38_b_polymorphism.animal.Animal;

public class Library {
    public static void main(String[] args) {
        // Possible references of JavaTextBook: JavaTextBook, EBook(parent), Book(parent/grandParent), Downloadable
        JavaTextBook b1 = new JavaTextBook();
        // access to instance variables:
        b1.isFUn = true;
        b1.storageSize = 124;
        b1.name = "Java Programming";
        // access to instance methods:
        b1.open();
        b1.read();
        b1.download();

        System.out.println("---------------------------------");
        EBook b22 = b1; // UPCASTING - implicitly (automatically) - limited the access of b1 if you us b22 as reference
        EBook b2 = new JavaTextBook(); // UPCASTING - implicitly (automatically)
        // access to instance variables:
        //b2.isFUn = true; // Reference EBook does not have access to isFun
        ( (JavaTextBook) b2 ).isFUn = true; // DOWNCASTED Ebook reference to JavaTextBook so, I can access to the members of JavaTextBook class
        b2.storageSize = 124;
        b2.name = "Java Programming";
        // access to instance methods:
        b2.open();
        b2.read();
        b2.download();


        System.out.println("---------------------------------");
        Book b3 = new JavaTextBook();        // access to instance variables:
        //b3.isFUn = true; // Reference Book does not have access to isFun
        // ( (EBook)b3 ).isFUn = true; //DOWNCASTED to EBook - but EBook still does not have access to isFun
        ( (JavaTextBook)b3 ).isFUn = true; //DOWNCASTED to EBook - but EBook still does not have access to isFun
        //b3.storageSize = 124; // Reference Book does not have access to storageSize
        ( (EBook)b3 ).storageSize = 124; // DOWNCASTED to EBook - Reference EBook has access to storageSize
        ( (JavaTextBook)b3 ).storageSize = 124; // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to storageSize
        b3.name = "Java Programming";
        // access to instance methods:
        // b3.open(); // Reference Book does not have access to open()
        ( (EBook)b3 ).open(); // DOWNCASTED to EBook - Reference EBook has access to open()
        ( (JavaTextBook)b3 ).open(); // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to open()
        b3.read();
        // b3.download(); // Reference Book does not have access to download()
        ((EBook)b3).download(); // DOWNCASTED to EBook - Reference EBook has access to download()
        ((JavaTextBook)b3).download(); // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to download()



        System.out.println("---------------------------------");
        Downloadable b4 =new JavaTextBook();
        // access to instance variables:
        // b4.isFUn = true;  // Reference Downloadable does not have access to isFun
        // ((EBook)b4).isFUn = true;  // DOWNCASTED to EBook - Reference EBook still does not have access to isFUn
        ((JavaTextBook)b4).isFUn = true;  // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to isFUn
        // ((Book)b4).isFUn = true; // NO Direct relation - NO NEED casting like this.


        // b4.storageSize = 124;  // Reference Downloadable does not have access to storageSize
        ((EBook) b4).storageSize = 124;  // DOWNCASTED to EBook - Reference EBook has access to storageSize
        ((JavaTextBook)b4).storageSize = 124;  // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to storageSize
        //  b4.name = "Java Programming";  // Reference Downloadable does not have access to name
        ( (EBook) b4 ).name = "Java Programming";  // DOWNCASTED to EBook - Reference EBook has access to name
        ( (JavaTextBook)b4 ).name = "Java Programming";  // DOWNCASTED to JavaTextBook - Reference JavaTextBook has access to name
        // access to instance methods:
        //b4.open();  // Reference Downloadable does not have access to open()
        //b4.read();  // Reference Downloadable does not have access to read()
        // All the rulles with instance variables applies to these methods as well for accessibility
        b4.download();


        System.out.println("***************************************");
        System.out.println(b1 instanceof JavaTextBook); // instanceof -- > object of
        System.out.println(b2 instanceof JavaTextBook);
        System.out.println(b2 instanceof EBook);
        System.out.println(b2 instanceof Book);
        System.out.println(b4 instanceof JavaTextBook);
        System.out.println(b4 instanceof Animal);
        System.out.println(b4 instanceof Book); // This will still be true even-though there no direct but indirect relation


    }
}