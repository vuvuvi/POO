package be.storm.exception;

public class ExceptionDividedByZero extends Exception {
    public ExceptionDividedByZero() {
        super("Divided by zero");
    }

    public ExceptionDividedByZero(String message) {
        super(message);
    }
}
