package labs_examples.generics.labs;

import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
// 1.
class SumOfTwoDoubles {
    public static <T extends Number> Double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Double dbl1 = 3.2;
        Double dbl2 = 6.8;

        System.out.println("The sum of double numbers: " + sum(dbl1, dbl2));
    }
}

// 3.  Not sure about below
class ExchangePositions {
    public static <T> int exchange(T[] arr, int d, int e) {
        T a = arr[d];
        arr[d] = arr[e];
        arr[e] = a;
        return (int) a;
    }

    public static void main(String[] args) {
        Integer[] myArray = {1, 0, 2};
        System.out.println(exchange(myArray, 0, 2));
    }
}

// 4. Not sure
class largeElement {
    public static <T extends Comparable> Integer largeElement(List<T> list, int begin, int end) {
        T largestElem = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(largestElem) > 0) {
                largestElem = current;
            }
        }
        return (Integer) largestElem;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(15, 18, 99, 112, 199);
        int begin = 2;
        int end = 3;
        Integer largestElem = largeElement(numbers, begin, end);
        System.out.println("Largest element " + begin + "" + end + "" + largestElem);
    }
}


