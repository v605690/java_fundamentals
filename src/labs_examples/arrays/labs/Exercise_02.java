package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int index = -1;
        // write code here
        for (int i = 0; (i < array.length) && (index == -1); i++) {
            if (array[i] == 3) {
                index = i;
            }
        }
        System.out.println(index);
    }
}