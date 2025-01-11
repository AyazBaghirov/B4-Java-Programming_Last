package day39_b_exception;
public class SecondTry2 {
    public static void main(String[] args) {

        try{
            // IN try block, if there are multiple different exception, the code in try will stop from the FIRST EXCEPTION
            String s = null;
            System.out.println(s.length()); // NullPointerException



            int [] arr = {1, 3, 5, 6};
            //            0  1  2  3
            System.out.println(arr[8]); // ArrayIndexOutOfBoundsException

            // } catch (Exception e){           // can use this as it is the parent
            // } catch (RuntimeException e){    // can use this as it is the parent
        } catch (RuntimeException e){
            System.out.println("Either NullPointerException or ArrayIndexOutOfBoundsException is caught");
        }


        System.out.println("Finish Line");

    }
}