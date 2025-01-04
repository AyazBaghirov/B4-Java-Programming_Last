package day35_inheritance.computer;

public class Windows extends Computer {

    String edgeBrowser;

    // obj of Windows class has access: 3 -> 2 from parent and 1 from itself

    // Constructor - helps to initialize instance variables
    public Windows(String os, int memory) {
        //this.os = os;
        //this.memory = memory;
        super(os, memory);
    }


    public Windows(String os, int memory, String edgeBrowser) {
        //this.os = os;
        //this.memory = memory;
        this(os, memory);
        this.edgeBrowser = edgeBrowser;
    }




}