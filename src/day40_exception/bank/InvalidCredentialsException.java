package day40_exception.bank;
// Any class that is child class of RunTimeException class is Unchecked/Runtime exception class
// Any class that is child class of Exception class is checked/CompileTime Exception [except RunTimeException]
public class InvalidCredentialsException extends Exception{
    public InvalidCredentialsException(String message) {
        super(message);
    }
}