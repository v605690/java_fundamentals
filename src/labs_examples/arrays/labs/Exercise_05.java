package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int count = 0;

        int[] nums = {33, 5, 12, 23, 66, 83, 18, 19};

        for (int i = nums.length - 1; i >=0; i-- ) {
            if (count++ % 2 != 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
