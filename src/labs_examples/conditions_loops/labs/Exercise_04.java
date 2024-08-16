package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int x;

        for (x = 0; x<=100; x++) {
            if ( x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
