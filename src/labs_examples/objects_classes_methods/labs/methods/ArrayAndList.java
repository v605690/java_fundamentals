package labs_examples.objects_classes_methods.labs.methods;
import java.util.ArrayList;

public class ArrayAndList {
    public static int ArrayListMethod(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> arr = new ArrayList();

        arr.add(3);
        arr.add(8);
        arr.add(14);
        arr.add(9);
        arr.add(22);
        arr.add(16);
        arr.add(31);
        arr.add(48);

        divisor1 = 1;
        divisor2 = 2;

        int zeroNum = arr.get(0);
        maxNum = arr.get(0);

        int n = arr.size();

        for (int i = 1; i < n; i++) {
            if (arr.get(i) < zeroNum) {
                zeroNum = arr.get(i) / divisor1;
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > maxNum) {
                maxNum = arr.get(i) / divisor2;

            }
        }

        System.out.println(maxNum);

        return zeroNum;
    }
}
