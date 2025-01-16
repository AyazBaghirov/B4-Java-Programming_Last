package day40_exception.bank;

public class Account {
    public double balance;

    public Account(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            // System.out.println("Balance only has $" + balance);
            // throw new RuntimeException("Balance only has $" + balance);
            throw new NotEnoughBalanceException("Balance only has $" + balance);
        } else {
            balance -= amount;
        }

    }


    public void login(String username, String password) throws InvalidCredentialsException{

        if (!username.equalsIgnoreCase("loopcamp")){
            //System.out.println("Invalid username");
            //throw new Exception("Invalid username");
            throw new InvalidCredentialsException("Invalid username");
        } else{
            System.out.println("Successfully username");
        }

        if (!password.equals("Test2025")){
            //System.out.println("Invalid password");
            //throw new Exception("Invalid Password");
            throw new InvalidCredentialsException("Invalid password");
        } else{
            System.out.println("Successful password");
        }

    }

}
