package be.storm.exception;

public class Main {
    public static void main(String[] args) {

        try {
            MathOperator.division(8,0);
            System.out.println("Succeed");
        }catch (ExceptionDividedByZero ex) {
            System.out.println("Catch de l'exception");
            System.out.println(ex.getMessage());
        }
        System.out.println("Finito");
    }
}
