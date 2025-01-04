package day36_inheritance.app;
/*
Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
 */
public class Instagram extends App  {

    public Instagram (double version) {
        super("Instagram", version);
    }

    public void postPicture() {
        System.out.println("Posting picture to " + name);
    }


}