package labs_examples.objects_classes_methods.labs.methods;

public class FindMaxNumber {

    static int array[] = {23, 51, 17, 33};

    public static int findLargeNumber(int i, int i1, int i2) {

        int maxNumber = array[0];

        for (i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
