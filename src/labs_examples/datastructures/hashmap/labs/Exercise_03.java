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

        long beforeTimer = System.currentTimeMillis();
        Timestamp ts1 = new Timestamp(beforeTimer);
        System.out.println(ts1);

        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            linkedList.add(" LinkList");
            linkedList.add(" Data\n" + i);
//            try {
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : linkedList) {
            sb.append(str);
        }
        String combinedString = sb.toString();
        System.out.println(combinedString);

        for (int i = 0; i < 100; i++) {
            linkedList.set(i, " Updated LinkListed Data\n" + i);

        }

        StringBuilder sb2 = new StringBuilder();
        for (String str : linkedList) {
            sb2.append(str);
        }
        String combinedString2 = sb2.toString();
        System.out.println(combinedString2);

        long afterTimer = System.currentTimeMillis();
        Timestamp ts2 = new Timestamp(afterTimer);
        System.out.println(ts2);

        var contains = linkedList.contains("New");
        System.out.println(contains);
        System.out.println("----------------------");
        Stack<String> demoStack = new Stack<>();

        if (demoStack.empty()) {
            System.out.println("Stack is empty");
        for (int i = 0; i < 100 + 1; i++) {
            demoStack.push(i + " Loaded");
            demoStack.push(" Stack");
            demoStack.push(" Data\n");
        }

        StringBuilder sb3 = new StringBuilder();
        for (String str : demoStack) {
            sb3.append(str);
        }
        String combinedString3 = sb3.toString();
        System.out.println(combinedString3);
        }

        var results = (demoStack.equals(" Stack Data\n"));
        System.out.println(results);

        for (String str : demoStack) {
            System.out.println(str);
        }
        demoStack.clear();

        System.out.println("---------------------------");

        for (String str : demoStack) {
            System.out.println(str);
        }
        System.out.println("Stack Empty");

        System.out.println("-----------------------------");

        HashMap<String, Integer> dataDog = new HashMap<>();

        if (demoStack.empty()) {
            System.out.println("Stack is empty");
            for (int i = 0; i < 100 + 1; i++) {
                dataDog.put("dog", 4);
                demoStack.push(" Stack");
                demoStack.push(" Data\n");
            }

            StringBuilder sb3 = new StringBuilder();
            for (String str : demoStack) {
                sb3.append(str);
            }
            String combinedString3 = sb3.toString();
            System.out.println(combinedString3);
        }
    }
}
