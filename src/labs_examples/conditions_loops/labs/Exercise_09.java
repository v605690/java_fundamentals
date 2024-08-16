package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            if (x == 3 || x == 5) {
                break;
            }
            System.out.println(x);
        }
    }
}
