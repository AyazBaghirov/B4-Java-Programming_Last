package day40_exception.bank;

public class UseAccount {
    public static void main(String[] args) {

        Account account1 = new Account(100_000.00);

        try {

            account1.withdraw(10000);
            System.out.println(account1.balance); // 90_000

            System.out.println();

            account1.withdraw(150_000.00);
            System.out.println(account1.balance);


        } catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }



        System.out.println();


        // I got 2 options for this
        // 1 - handle
        // 2 - Bypass (in main() method signature)
        try {
            account1.login("loopcamp", "Pass");
        } catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Final Line");



    }
}