package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        String[][] trucks = {
                {"Pickup Truck", "Flat Bed Truck" },
                {"Garbage Truck", "Front Loader Truck", "Dump Truck"},
                {"Fire Truck", "Semi Truck", "Box Truck", "Fuel Truck"}
        };

        for (int i = 0; i < trucks.length; i++) {
            for (int x = 0; x < trucks[i].length; x++) {

                System.out.println(trucks[i][x]);
            }
        }
    }
}
