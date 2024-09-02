package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

public class SmallArray {

    public static int[] array(int[] arr) {
        Arrays.sort(arr);
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}
