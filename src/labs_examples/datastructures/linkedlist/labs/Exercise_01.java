package labs_examples.datastructures.linkedlist.labs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("banana");
        LinkedList<String> l2 = new LinkedList<>();
        l2.addAll(Arrays.asList("apple", "pair", "orange", "blackberries", "raspberries", "blueberries"));
       l1.addAll(l2);
        System.out.println(l1);
        l1.addFirst("kiwi");
        System.out.println(l1);
        l2.addLast("mango");
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l2.getLast());
        System.out.println(l2.get(2));
        l2.set(5, "peach");
        System.out.println(l2);
        l2.push("grapes");
        System.out.println(l2);
        l2.pop();
        System.out.println(l2);
        l2.remove();
        System.out.println(l2);
        System.out.println(l2.contains("pair"));

        LinkedList<String> l3 = new LinkedList<>();
        l3.add("cantaloupe");
        l3.add("papaya");
        l3.add("plum");
        ListIterator<String> lt = l3.listIterator();

        while (lt.hasNext()) {
            System.out.println(lt.next() + " ");
        }
        System.out.println(l3);
        l3.clear();
        System.out.println(l3);
    }
}
