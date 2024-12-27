package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException exc) {
            System.out.println("Exception Caught Here At Main Method");
        }
    }

    public static void divide() throws ArithmeticException {
        arithmetic();
    }

    public static void arithmetic() throws ArithmeticException {
        try {
            int num1 = 20;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("Result " + result);
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught " + exc.getMessage());
            throw exc;
        }
    }
}




