package day35_inheritance.computer;

public class Mac extends Computer {

    String safariBrowser;

    // obj of Mac class has access: 3 -> 2 from parent and 1 from itself


    public Mac(String os, int memory) {
        //this.os = os;
        //this.memory = memory;
        super(os, memory);
    }


    public Mac(String os, int memory, String safariBrowser) {
        //this.os = os;
        //this.memory = memory;
        //this(os, memory);
        super(os, memory);
        this.safariBrowser = safariBrowser;
    }
}