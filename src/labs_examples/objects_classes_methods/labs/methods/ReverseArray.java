package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArray(int[] arr) {

        System.out.println("Original Array " + Arrays.toString(arr));

        int i;
        System.out.println("In place reverse array: [");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        return arr;
    }
}
