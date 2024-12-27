package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class TryCatchDemo {
    public static void main(String[] args) {

    try {
        int[] myArray = {2, 5, 17, 23, 4};
        int index = 11;
        int value = myArray[index];
        System.out.println(value);
    } catch (ArrayIndexOutOfBoundsException exc) {
        System.out.println(exc.getMessage());
        }
    }
}