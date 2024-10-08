package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> computerPartsList = new ArrayList();
        computerPartsList.add("CPU");
        computerPartsList.add("Memory");
        computerPartsList.add("Mother Board");
        computerPartsList.add("GPU");
        computerPartsList.add("Hard Drive");
        computerPartsList.add("Monitor");
        computerPartsList.add("Keyboard & Mouse");

        if (!computerPartsList.isEmpty()) {
            Collections.sort(computerPartsList);
            for (String c : computerPartsList) {
                System.out.println(c + " ");
            }
        }
    }
}
