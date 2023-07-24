package be.storm.exception;

public class MathOperator {

    public static int division(int a, int b) throws ExceptionDividedByZero {
        if (b== 0) {
            throw new ExceptionDividedByZero();
        }
        return a/b;
    }

}
