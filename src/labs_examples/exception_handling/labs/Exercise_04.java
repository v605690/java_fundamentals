package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] numArray = {2, 5, 3, 9, 11};
            try {
                int x = numArray[5];
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Exception Occurred in inner try-catch block");
            }
        } catch (Exception exc) {
            System.out.println("Exception Occurred outer try-catch block");
        }
    }
}
