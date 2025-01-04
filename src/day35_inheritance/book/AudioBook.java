package day35_inheritance.book;
// Template Class - Blueprint for object
public class AudioBook extends Book {
//    // Instance Variables
//    String author;
//    int authorAge;
//    String genre;
//    String title;
//    int chapterCount;
//    double price;
//    boolean hasMovie;

    double duration; // 30mins
    String narrator;


    // Instance method
    public void listen () {
        System.out.println("Listening to " + title + " by " + narrator);
    }

}
