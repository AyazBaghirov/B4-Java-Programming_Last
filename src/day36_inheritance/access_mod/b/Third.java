package day36_inheritance.access_mod.b;

import day36_inheritance.access_mod.a.First;
// Different package - Different Class
public class Third extends First {

    public static void main(String[] args) {

        First f = new First();
        System.out.println( f.one );
        //System.out.println( f.two ); // protected - parent class object - not accessible
        //System.out.println( f.three ); // default is not accessible out side of the package
        //System.out.println( f.four );   // private is not accessible out side of the class



        Third t = new Third();
        System.out.println( t.one );
        System.out.println( t.two ); // protected - child class object - not accessible
        //System.out.println( t.three );
        //System.out.println( t.four );

    }

    /*
    object 'f' is in the different package and different class
    object 't' is in the different package and different class


    public      -> accessible different package - different class
    protected   -> accessible different package - different class
                        if there is inheritance
                            - if you try to reach the protected variable by PARENT class object - NOT accessible
                            - if you try to reach the protected variable by the CHILD class object - accessible
    default     -> accessible different package - different class
    private     -> NOT accessible different package - different class
 */
}