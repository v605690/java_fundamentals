package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full - .60
 *      4) triple the size of the underlying array on resize() - x3
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */

class MyHashMapController {

    public static void main(String[] args) {

    HashMap<String, Long> map = new HashMap<>();

    map.put("John", 7134567890L);
    map.put("Toby", 9894567878L);
    map.put("Clint", 3664567878L);
    map.put("Karl", 8564567878L);
    map.put("Jon", 5234567878L);
    map.put("Lisa", 9334567878L);
    map.put("Ryan", 8234567878L);
    map.put("Kim", 4234567878L);
    map.put("Nick", 9234567878L);
    map.put("Saul", 6234567878L);
    map.put("Tom", 2234567878L);
    map.put("Mike", 7234567878L);
    map.put("Mike", 7234567878L);
    map.put("Lary", 7124567878L);
    map.put("Maria", 3444567878L);
    map.put("Jason", 6114567878L);
    map.put("Jessica", 8444567878L);
    map.put("Jenifer", 9154567878L);

    System.out.println(map.get("John"));
    System.out.println(map.checkKeys("Angie"));
    System.out.println((map.get("Lisa")));
    System.out.println(map.get("Mary") == null ? "The element does not exist" : map.get ("Mary"));
    System.out.println(map.values().printList());
    System.out.println(map.values().size());

    }
}