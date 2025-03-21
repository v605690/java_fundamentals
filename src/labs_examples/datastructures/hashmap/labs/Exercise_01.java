package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> countryCityTemps = new HashMap();
        HashMap<String, Integer> usaCityTemps = new HashMap();

        countryCityTemps.put("Buenos Aires", 81);
        countryCityTemps.put("Brussels", 52);
        countryCityTemps.put("Rio de Janeiro", 75);
        countryCityTemps.put("Brasilia", 75);
        countryCityTemps.put("La Paz", 50);
        countryCityTemps.put("Bogota", 59);
        countryCityTemps.put("Havana", 77);
        countryCityTemps.put("Prague", 39);
        countryCityTemps.put("Copenhagen", 39);
        countryCityTemps.put("Cairo", 55);
        countryCityTemps.put("San Salvador", 81);
        countryCityTemps.put("Helsinki", 36);

        usaCityTemps.put("Phoenix", 80);
        usaCityTemps.put("Los Angeles", 64);
        usaCityTemps.put("San Francisco", 57);
        usaCityTemps.put("Denver", 54);
        usaCityTemps.put("Washington DC", 56);
        usaCityTemps.put("Miami", 76);
        usaCityTemps.put("Atlanta", 45);
        usaCityTemps.put("Houston", 67);

        int cairoTemp = countryCityTemps.get("Cairo");
        System.out.println(cairoTemp);
        countryCityTemps.putAll(usaCityTemps);
        System.out.println("Updated Country City Temps Around The World: " + countryCityTemps);
        System.out.println(countryCityTemps.size());
        System.out.println(usaCityTemps.containsKey("Houston"));
        System.out.println(usaCityTemps.keySet());
        System.out.println(usaCityTemps.entrySet());
        usaCityTemps.putIfAbsent("New York", 49);
        System.out.println(usaCityTemps);
        countryCityTemps.remove("Helsinki");
        System.out.println(countryCityTemps);
        countryCityTemps.replace("San Salvador",81, 90);
        System.out.println(countryCityTemps);
        countryCityTemps.forEach((k, v) -> {
            System.out.println(k + " -> " + v + "F");
        });
        usaCityTemps.clear();
        System.out.println(usaCityTemps);
    }
}
