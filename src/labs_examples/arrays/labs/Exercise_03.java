package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int count = 3;

        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums[i].length; x++) {
                nums[i][x] = count;
                count = count +3;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums[i].length; x++) {
                System.out.print(nums[i][x] + " | ");
            }
            System.out.println();
        }
    }
}
