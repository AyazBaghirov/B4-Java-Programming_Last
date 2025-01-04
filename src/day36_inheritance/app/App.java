package day36_inheritance.app;
/*
Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

 */
public class App {
    // Instance variables -> based on the access modifier, they inherit to the child class if there is INHERITANCE
    // Every object has its own set of copy
    String name;
    double version;

    // Constructor
    public App (String name, double version) {
        this.name = name;
        this.version = version;
    }

    // Instance method -> based on the access modifier, they inherit to the child class if there is INHERITANCE
    public void download() {
        System.out.println(name + " is downloading version " + version);
    }


}