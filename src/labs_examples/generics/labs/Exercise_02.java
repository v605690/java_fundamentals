package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{
    public static <T extends Number> int sum(ArrayList<T> l) {
        int total = 0;
        for (T t : l) {
            total += t.intValue();
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList();
        numList.add(2);
        numList.add(5);
        numList.add(9);
        numList.add(20);
        numList.add(12);

        System.out.println("Sum Of NumList: " + sum(numList));
    }
}