package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

import static labs_examples.objects_classes_methods.labs.methods.SmallArray.array;

public class MethodTraining {
    public static void main(String[] args) {
        overload(4);
        overload(4, 6);

        Person person1 = new Person("Larry");

        Person person2 = person1;

        System.out.println("Reference Type: " + person1.name);
        System.out.println("Reference Type: " + person2.name);

        person2.name = "Bob";

        System.out.println("Reference Type: " + person1.name);
        System.out.println("Reference Type: " + person2.name);

        System.out.println("Largest of 4 numbers is: " + FindMaxNumber.findLargeNumber(2, 3, 4));

        System.out.println("Number of Consonants " + FindConsonants.ConsonantsMethod());

        FindPrime prime = new FindPrime();

        int[] array = {12, 17, 3, 66};
        int[] numbers = SmallArray.array(array);
        int[] n = array(numbers);
        System.out.println("Highest to the Lowest Array: " + Arrays.toString(n));

        ReverseArray r = new ReverseArray();

        int[] arr = {14, 32, 21, 66, 71};
        int[] a = r.reverseArray(arr);
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



