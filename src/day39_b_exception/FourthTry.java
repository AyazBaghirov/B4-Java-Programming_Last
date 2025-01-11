package day39_b_exception;

public class FourthTry {
    public static void main(String[] args) {


        //InterruptedException --- >  compiletime exception
        try{
            Thread.sleep(-20);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Finish Line");

    }
}
