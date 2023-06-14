package gr.aueb.cf.exceptions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUId = 1L;

    //We prefer the second method,
    // as it holds data regarding
    // the exception
    public InsufficientBalanceException() {}
    
    public InsufficientBalanceException(double balance, double ammount) {
        super("Insufficient balance " + balance + " for amount " + ammount);
    }
}
