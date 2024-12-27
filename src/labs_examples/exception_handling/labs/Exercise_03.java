package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
           int[] numArray = new int[10];
           numArray[4] = 10 / 0;
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic Exception : Divide by zero!!" );
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("ArrayIndexOutOfBounds : Access index out of bounds error");
        } catch (Exception exc) {
            System.out.println("Exception : " + exc.getMessage());
        } finally {
            System.out.println("Program completed");
        }
    }
}