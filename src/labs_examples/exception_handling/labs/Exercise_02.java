package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class tryMultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[4]);
            int z = x / y;
            System.out.println("Before exception is generated. " + z);
        } catch (ArithmeticException exc) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Invalid number of arguments!");
        } catch (NumberFormatException exc) {
            System.out.println("Invalid input format!");
        }
    }
}

