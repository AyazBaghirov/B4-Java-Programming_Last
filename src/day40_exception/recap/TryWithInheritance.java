package day40_exception.recap;

public class TryWithInheritance {
    public static void main(String[] args) {
        try {
            int[] nums = {23, 45, 2, 6, 2};
            System.out.println(nums[9]);      // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (IndexOutOfBoundsException e) {

        } catch (Exception e) {

        }

        /**
         Parent exception class canNOT be before the Child exception class
         Because the Parent Exception class can catch whatever the Child could catch as well
         So, Child Exception class will never be reached


         All possible references of ArrayIIndexOutOfBoundsException

         ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
         IndexOutOfBoundsException e = new ArrayIIndexOutOfBoundsException();
         RunTimeException e = new ArrayIIndexOutOfBoundsException();
         Exception e = new ArrayIIndexOutOfBoundsException();
         Throwable e = new ArrayIIndexOutOfBoundsException();

         */



    }
}