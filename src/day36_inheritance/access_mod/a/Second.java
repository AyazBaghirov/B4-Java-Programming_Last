package day36_inheritance.access_mod.a;
// Same package - different class
public class Second extends First{


    public static void main(String[] args) {
        First f = new First();
        System.out.println( f.one );
        System.out.println( f.two );
        System.out.println( f.three );
        //System.out.println( f.four );


        Second s = new Second();
        System.out.println( s.one );
        System.out.println( s.two );
        System.out.println( s.three );
        //System.out.println( s.four );

    }

/*
    object 'f' is in the same package and different class
    object 's' is in the same package and different class


    public      -> accessible same package - different class
    protected   -> accessible same package - different class
    default     -> accessible same package - different class
    private     -> NOT accessible same package - different class
 */

}