package labs_examples.datastructures.hashmap.labs;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 *      HashMaps Exercise_02
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class megaDTS {
    public static void main(String[] args) {
        int m = 100;

        long dsTimer = System.currentTimeMillis();
        Timestamp bllt = new Timestamp(dsTimer);
        System.out.println(bllt);

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("-------------LinkList-------------");

        for (int i = 1; i <= m; i++) {
            linkedList.add("Data " + i);
        }

        System.out.println(linkedList.size());

        StringBuilder sb = new StringBuilder();
        for (String str : linkedList) {
            sb.append("Linklist " + str + "\n");
        }
        String combinedString = sb.toString();
        System.out.println(combinedString);

        System.out.println(linkedList.get(97));
        System.out.println(linkedList.indexOf("Data 98"));

        System.out.println("-----------------------------------------------------");

        for (int i = 1; i < m; i++) {
            linkedList.set(i, "Data Updated " + i);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String str : linkedList) {
            sb2.append("LinkedList " + str + "\n");
        }

        String combinedString2 = sb2.toString();
        System.out.println(combinedString2);

        Timestamp allt = new Timestamp(dsTimer);
        System.out.println(allt);

        var contains = linkedList.contains("Data Updated 90");
        System.out.println(contains);
        System.out.println();

        Stack<String> demoStack = new Stack<>();
        System.out.println("----------Stack-----------");

        Timestamp bst = new Timestamp(dsTimer);
        System.out.println(bst);

        if (demoStack.empty()) {
            System.out.println("Stack data is empty");
        for (int i = 1; i < m + 1; i++) {
            demoStack.push(i + " Stack Data");
        }

        StringBuilder sb3 = new StringBuilder();
        for (String str : demoStack) {
            sb3.append("Loaded " + str + "\n");
        }
        String combinedString3 = sb3.toString();
        System.out.println(combinedString3);
        }

        Timestamp ast = new Timestamp(dsTimer);
        System.out.println(ast);

        var results = (demoStack.equals("Stack Data"));
        System.out.println(results);

        for (String str : demoStack) {
            System.out.println("Adding " + str);
        }
        demoStack.clear();

        System.out.println("---------------------------");

        for (String str : demoStack) {
            System.out.println(str);
        }
        System.out.println("Stack Empty");

        System.out.println("-----------------------------------------------------------------");

        Timestamp bht = new Timestamp(dsTimer);
        System.out.println(bht);

        HashMap<String, Integer> dataDog = new HashMap<>();
        System.out.println("------------HashMap------------------");

        if (dataDog.isEmpty()) {
            System.out.println("Hashmap is empty");

            for (int i = 0; i < m + 1; i++) {
                dataDog.put("Dog Breed - " + i, 1);
            }

            StringBuilder sb4 = new StringBuilder();
            for (String str : dataDog.keySet()) {
                sb4.append("American Kennel Club " + str + "\n");
            }
            String combinedString4 = sb4.toString();
            System.out.println(combinedString4);

            Timestamp aht = new Timestamp(dsTimer);
            System.out.println(aht);
        }
    }
}
