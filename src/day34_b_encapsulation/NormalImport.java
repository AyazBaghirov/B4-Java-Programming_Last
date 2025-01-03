package day34_b_encapsulation;
import my_utilities.ArrayUtil;

public class NormalImport {
    public static void main(String[] args) {
        int [] a = {12, 4, 1, 756, 2, 23};

        //ArrayUtil obj = new ArrayUtil();
        System.out.println(  ArrayUtil.sum(a) );

    }
}