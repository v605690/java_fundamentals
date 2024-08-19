package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 8, 4, 13, 7, 9, 23, 19, 33};

        int sum = 0;

            for (int i = 0; i < nums.length; i++) {
               sum = sum + nums[i];
        }
        System.out.println("The Sum is: " + sum);

        double average = sum / nums.length;

        System.out.println("The Average is: " + average);
    }
}