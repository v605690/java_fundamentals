package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            withDrawFunds(20);
        } catch (ArithmeticException | OverdraftException exc) {
            System.out.println("Insufficient funds");
        }
    }

    public static void withDrawFunds(double amount) throws OverdraftException {
        try {

        int accountBalance = 2;
        if (accountBalance < amount) {
            throw new OverdraftException("Insufficient funds");
            }
        } catch (ArithmeticException exc) {
            System.out.println("Insufficient funds");
            throw exc;
        }
    }
}

class OverdraftException extends Exception {
    public OverdraftException(String message) {
        super(message);
    }
}
