package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

import static labs_examples.objects_classes_methods.labs.methods.SmallArray.array;

public class MethodTraining {
    public static void main(String[] args) {

        OverLoadingEx calc = new OverLoadingEx();

        int sum1 = calc.myadd(2, 4);
        int sum2 = calc.myadd(3, 6, 9);
        double sum3 = calc.myadd(3.3, 7.7, 1.4);

        System.out.println("Overload Sum1: " + sum1);
        System.out.println("Overload Sum2: " + sum2);
        System.out.println("Overload Sum3: " + sum3);

        overload(4);
        overload(4, 6);

        PassByValue pv = new PassByValue();

        int pbv = 55;
        pv.modifyValue(pbv);
        System.out.println("Pass By Value Example: " + pbv);

        Person person1 = new Person("Larry", 36);

        Person person2 = person1;

        System.out.println("Pass By Reference: " + person1.name);
        System.out.println("Pass By Reference: " + person2.name);

        person2.name = "Bob";

        System.out.println("Pass By Reference: " + person1.name);
        System.out.println("Pass By Reference: " + person2.name);

        System.out.println("Largest of 4 numbers is: " + FindMaxNumber.findLargeNumber(2, 3, 4));

        System.out.println("Number of Consonants " + FindConsonants.ConsonantsMethod());

        FindPrime prime = new FindPrime();

        int[] array = {12, 17, 3, 66};
        int[] numbers = SmallArray.array(array);
        int[] n = array(numbers);
        System.out.println("Highest to the Lowest Array: " + Arrays.toString(n));

        ReverseArray r = new ReverseArray();

        int[] arr = {14, 32, 21, 66, 71};
        n = r.reverseArray(arr);
        System.out.println(" ");

        System.out.println(ArrayAndList.ArrayListMethod(48, 1, 2));

    }

    public static void overload(int a) {
        System.out.println("Arguments " + a);
    }

    public static void overload(int a, int b) {
        System.out.println("Arguments " + a + " and " + b);

        a = 5;
        b = a;

        b = 10;

        System.out.println("Value Type is: a " + a);
        System.out.println("Value Type is: b " + b);

    }
}



